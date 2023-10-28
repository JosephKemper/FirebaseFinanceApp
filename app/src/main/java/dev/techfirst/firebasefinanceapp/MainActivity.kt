package dev.techfirst.firebasefinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.techfirst.firebasefinanceapp.ui.theme.FirebaseFinanceAppTheme
import java.math.BigDecimal
import java.text.DateFormat
import java.util.Date
import java.text.SimpleDateFormat


// Data type for the transactions
data class TransactionData(
    val transactionAmount: BigDecimal,
    val date: Date,
    val description: String?,
    val isDeposit: Boolean
)

val transactionList = mutableListOf<TransactionData>()
var availableBalance = BigDecimal("o.oo")
var isDeposit = true
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseFinanceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    println("Android")
                }
            }
        }
    }
}

// Convert string taken from user to a big decimal.
fun convertTransaction(rawTransactionAmount: String): BigDecimal {
    return try {
        BigDecimal(rawTransactionAmount) // string to BigDecimal
    } catch (invalidTransactionAmountException: NumberFormatException) {
        BigDecimal("0.00") // Replace an invalid entry with 0.00
    }
}

// Ensure the value entered by the user was entered as a positive number
fun ensurePositive (transaction: BigDecimal): BigDecimal {
    return if (transaction >= BigDecimal.ZERO){
        transaction
    } else {
        transaction.negate()
    }
}

// Converts raw string date to a Date type variable
fun convertToDate (dateString: String): Date {
    val formatDate = DateFormat.getDateInstance()
    return try {
        formatDate.parse(dateString)!! // Converts string to date format
    } catch (parseException: Exception) {
        Date() // Returns today's date if error
    }

}

// Keep a running total of the balance of the account for display on the app
fun updateBalance(transactionAmount: BigDecimal, isDeposit: Boolean){
    if (isDeposit) { // Check if the transaction is a deposit
        availableBalance += transactionAmount // add to balance
    } else { // Otherwise subtract from the balance
        availableBalance -= transactionAmount
    }

}

// Get Transaction data ready to store in transactionList and adds it to the list
fun processTransaction(transactionAmountAsString: String, rawDate: String, description: String?, isDeposit: Boolean){
    val transactionAmount = ensurePositive(BigDecimal(transactionAmountAsString)) // Convert transaction string to number
    val date = convertToDate (rawDate) // Format the date string
    updateBalance(transactionAmount,isDeposit) // update the current balance
    // Create instance of the Transaction data class and assign it to the transaction variable
    val transaction = TransactionData (transactionAmount, date, description, isDeposit)
    // add transaction to list
    transactionList.add(transaction)
}
