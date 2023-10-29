# Overview

{description of the software, how it integrates with a Cloud Database, and how to use program}
In this project, I plan to build a simple app that will demonstrate my ability to lean new skills and technologies. I specifically plan to build a simple financial management app that will use Google Firebase, Jetpack Compose, and Kotlin. The app will let you track income and expenses, and create budgets.    

My goals for creating this app is simply to challenge myself and prove that I can become a mobile developer. 


[Software Demo Video](https://youtu.be/ATb2psXYkJU)

# Cloud Database

For my database, I am using Google Firebase. In addition to storing the data, I am using Firebase for login authentication. 

# Development Environment

Android Studio Giraffe | 2022.3.1 Patch 2
Kotlin
## Project Level Plugins
- com.android.application version 8.1.2
- com.android.library version 8.1.2
- org.jetbrains.kotlin.android version 1.9.0
- com.google.devtools.ksp version 1.9.0-1.0.11
- com.google.dagger.hilt.android version 2.47
- com.google.gms.google-services version 4.4.0
- com.google.firebase.crashlytics version 2.9.9
- com.google.firebase.firebase-perf version 1.4.2

## App Level Plugins
- com.android.application (default version)
- org.jetbrains.kotlin.android (default version)
  com.google.devtools.ksp (default version)
  com.google.gms.google-services (default version)
  com.google.firebase.crashlytics (default version)
  com.google.firebase.firebase-perf (default version)
  dagger.hilt.android.plugin (default version)
  com.ncorti.ktfmt.gradle version "0.10.0"

## Dependencies
### Core libraries
- androidx.core:core-ktx:1.9.0
- androidx.appcompat:appcompat:1.6.1")
- com.google.android.material:material:1.10.0")

### Compose and UI libraries
- compose:compose-bom:2023.10.00
- androidx.compose.ui:ui
- androidx.compose.material:material
- androidx.compose.ui:ui-tooling-preview
- androidx.compose.material:material-icons-extended:1.5.3
- androidx.compose.ui:ui-graphics
- androidx.compose.material3:material3:1.1.2

### Lifecycle and Activity libraries
- androidx.lifecycle:lifecycle-runtime-compose:2.6.2
- androidx.lifecycle:lifecycle-runtime-ktx:2.6.2
- androidx.activity:activity-compose:1.8.0

### Navigation and Preference libraries
- androidx.navigation:navigation-compose:2.7.4
- androidx.hilt:hilt-navigation-compose:1.0.0
- androidx.preference:preference-ktx:1.2.1

### Coroutines and Permissions libraries
- org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4
- com.google.accompanist:accompanist-permissions:0.30.1

### Dagger Hilt libraries
- com.google.dagger:hilt-android:2.47
- com.google.dagger:hilt-compiler:2.47

### Firebase libraries
- com.google.firebase:firebase-bom:32.3.1
- com.google.firebase:firebase-analytics-ktx
- com.google.firebase:firebase-crashlytics-ktx
- com.google.firebase:firebase-auth-ktx
- com.google.firebase:firebase-firestore-ktx
- com.google.firebase:firebase-perf-ktx
- com.google.firebase:firebase-config-ktx
- com.google.firebase:firebase-messaging-ktx

### Test libraries
- junit:junit:4.+
- androidx.test.ext:junit:1.1.5
- androidx.compose.ui:ui-test-junit4

### Dagger Hilt testing library
- com.google.dagger:hilt-android-testing:2.43.2

### Truth library for fluent testing
- com.google.truth:truth:1.1.3

### Dagger Hilt compiler for Android tests
- com.google.dagger:hilt-compiler:2.47

### Debugging libraries
- androidx.compose.ui:ui-tooling
- androidx.compose.ui:ui-test-manifest

## Other Requirements
- compileSdk = 34
- minSdk= 21
  targetSdk = 34
- sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
-  kotlinCompilerExtensionVersion = 1.5.0

# Useful Websites

- [Build an Android app with Firebase and Jetpack Compose](https://firebase.google.com/codelabs/build-android-app-with-firebase-compose?hl=en#0)
- [Jetpack Compose Intro](https://developer.android.com/jetpack/compose)
- [Building an Android App a 9 part Series](https://firebase.blog/posts/2022/04/building-an-app-android-jetpack-compose-firebase)
- [Android Studio Download](https://developer.android.com/studio)
- [Android Emulator](https://developer.android.com/studio/run/emulator#install)
- [Github Code for Firebase Task Manager app](https://github.com/FirebaseExtended/make-it-so-android.git)
- [Firebase Setup Page](https://firebase.google.com/)
- [Firebase Console Page](https://console.firebase.google.com/)
- [Getting Started with Firebase on Android](https://www.youtube.com/watch?v=jbHfJpoOzkI&t=195s)
- [Web Site Name](http://url.link.goes.here)

# Future Work
## Minimum Viable Product

- Add expenses
- Add income
- Calculate total
- View transactions
- Login options
- Maintain data
- Delete data

## Extra features
- Multiple accounts
- Reports to track data
- Pattern analysis