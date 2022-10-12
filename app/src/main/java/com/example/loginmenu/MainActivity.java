package com.example.loginmenu;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ingresar=(Button)findViewById(R.id.buttonIngresar);

        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Home.class);
                startActivity(i);
            }
        });

    }

    public void facebook (View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(i);
    }
    public void twitter (View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
        startActivity(i);
    }
    public void instagram (View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
        startActivity(i);
    }



}