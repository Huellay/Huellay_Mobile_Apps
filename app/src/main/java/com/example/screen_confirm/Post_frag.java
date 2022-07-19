package com.example.screen_confirm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Post_frag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_frag);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bootnav);
        bottomNavigationView.setSelectedItemId(R.id.post);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.search:
                        Toast.makeText(getApplicationContext(),"Moving To Search Module",Toast.LENGTH_LONG).show();
                        //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                        startActivity(new Intent(getApplicationContext(),search_frag.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        Toast.makeText(getApplicationContext(),"Moving To Home Module",Toast.LENGTH_LONG).show();
                        //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                        startActivity(new Intent(getApplicationContext(),notification_screen.class));
                        overridePendingTransition(1,1);
                        return true;

                    case R.id.saved:
                        Toast.makeText(getApplicationContext(),"Moving To Saved Post Module",Toast.LENGTH_LONG).show();
                        //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                        startActivity(new Intent(getApplicationContext(),saved_frag.class));
                        overridePendingTransition(1,1);
                        return true;
                    case R.id.account:
                        Toast.makeText(getApplicationContext(),"Moving To Account Module",Toast.LENGTH_LONG).show();
                        //startActivity(new Intent(getApplicationContext(),Post_frag.class));
                        startActivity(new Intent(getApplicationContext(),profile_frag.class));
                        overridePendingTransition(0,0);
                        return true;




                }




                return false;
            }
        });
    }
}