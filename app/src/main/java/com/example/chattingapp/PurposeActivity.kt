package com.example.chattingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PurposeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purpose)

        val personalUsernameInput = findViewById<EditText>(R.id.username_personal)
        val personalSubmitButton = findViewById<Button>(R.id.submit_personal)

        val emailUsernameInput = findViewById<EditText>(R.id.username_email)
        val emailSubmitButton = findViewById<Button>(R.id.submit_personal_email)

        personalSubmitButton.setOnClickListener {
            val username = personalUsernameInput.text.toString()
            if (username.isNotEmpty()) {
                // Handle personal messaging submission
                Toast.makeText(this, "Personal Messaging: $username", Toast.LENGTH_SHORT).show()
                // Navigate to personal messaging activity (if any)
            } else {
                Toast.makeText(this, "Please enter a username.", Toast.LENGTH_SHORT).show()
            }
        }

        emailSubmitButton.setOnClickListener {
            val username = emailUsernameInput.text.toString()
            if (username.isNotEmpty()) {
                // Handle email messaging submission
                Toast.makeText(this, "Email Messaging: $username", Toast.LENGTH_SHORT).show()
                // Navigate to email messaging activity (if any)
            } else {
                Toast.makeText(this, "Please enter a username.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
