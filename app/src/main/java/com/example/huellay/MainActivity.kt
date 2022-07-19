package com.example.huellay

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    var cardView: CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cardView = findViewById(R.id.card_confirm)
        cardView!!.setOnClickListener(View.OnClickListener {
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