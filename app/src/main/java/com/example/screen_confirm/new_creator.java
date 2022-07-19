package com.example.screen_confirm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class new_creator extends AppCompatActivity {
    private CardView ccc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_creator);
        ccc=findViewById(R.id.artisian_card);
        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(new_creator.this,login_screen.class);
                startActivity(intent);

            }
        });
    }
}