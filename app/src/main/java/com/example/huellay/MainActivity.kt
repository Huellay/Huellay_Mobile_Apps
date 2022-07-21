package com.example.huellay

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var confirmButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        confirmButton = findViewById(R.id.card_confirm)
        confirmButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Action Confirmed", Toast.LENGTH_LONG).show()
            Toast.makeText(
                this,
                "Click on first card to move to the login page",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this, NewCreatorActivity::class.java)
            startActivity(intent)
        })
    }
}