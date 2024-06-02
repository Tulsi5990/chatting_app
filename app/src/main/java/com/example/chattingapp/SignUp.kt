package com.example.chattingapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Set click listener for Forgot Password


        // Set click listener for Sign Up
        findViewById<TextView>(R.id.login).setOnClickListener {
            Toast.makeText(this, "Sign Up clicked", Toast.LENGTH_SHORT).show()
            // Handle sign up click, e.g., open a new activity for sign up
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
