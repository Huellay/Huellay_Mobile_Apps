package com.example.screen_confirm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView=findViewById(R.id.card_confirm);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Action Confimed",Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),"Click on first card to move to the login page",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,new_creator.class);
                startActivity(intent);



            }
        });
    }
}