package com.example.huellay

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_screen)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bootnav)
        bottomNavigationView.selectedItemId = R.id.home
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.search -> {
                    Toast.makeText(
                        applicationContext,
                        "Moving To The Search Module",
                        Toast.LENGTH_LONG
                    ).show()
                    //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                    startActivity(Intent(applicationContext, SearchFragment::class.java))
                    overridePendingTransition(1, 1)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.post -> {
                    Toast.makeText(applicationContext, "Moving To Post Module", Toast.LENGTH_LONG)
                        .show()
                    //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                    startActivity(Intent(applicationContext, PostFragment::class.java))
                    overridePendingTransition(1, 1)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.saved -> {
                    Toast.makeText(
                        applicationContext,
                        "Moving To Saved Post Module",
                        Toast.LENGTH_LONG
                    ).show()
                    //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                    startActivity(Intent(applicationContext, SavedFragment::class.java))
                    overridePendingTransition(1, 1)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.account -> {
                    Toast.makeText(
                        applicationContext,
                        "Moving To Account Module",
                        Toast.LENGTH_LONG
                    ).show()
                    //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                    startActivity(Intent(applicationContext, ProfileFragment::class.java))
                    overridePendingTransition(1, 1)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }
}