package com.example.chattingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.app.Application
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Start the Login activity
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        // Close MainActivity so that the user can't navigate back to it
        finish()
    }
}

class ChattingApp : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}