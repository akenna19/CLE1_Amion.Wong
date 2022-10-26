package com.example.cle1_amionwong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ImageView imgOne = findViewById(R.id.Ruins);
        imgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ruins.class);
                startActivity(i);
            }
        });
        ImageView imgTwo = findViewById(R.id.LakawonIsland);
        imgTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, LakawonIsland.class);
                startActivity(i);
            }
        });
        ImageView imgThree = findViewById(R.id.BalayNegrense);
        imgThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, BalayNegrense.class);
                startActivity(i);
            }
        });
        ImageView imgFour = findViewById(R.id.SanSeb);
        imgFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, SanSeb.class);
                startActivity(i);
            }
        });
    }
}