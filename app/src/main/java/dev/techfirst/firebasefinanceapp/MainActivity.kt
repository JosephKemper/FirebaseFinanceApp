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
import java.util.Date

// Data type for the transactions
data class TransactionData(
    val transactionAmount: BigDecimal,
    val date: Date,
    val description: String?,
    val isDeposit: Boolean
)

val transactionList = mutableListOf<TransactionData>()
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

fun convertTransaction(rawTransactionAmount: String): BigDecimal {
    return try {
        BigDecimal(rawTransactionAmount)
    } catch (numberConversionException: NumberFormatException) {
        BigDecimal("0.00")
    }
}

fun ensurePositive (transaction: BigDecimal): BigDecimal {
    return if (transaction < BigDecimal.ZERO){
        transaction.negate()
    } else {
        transaction
    }
}