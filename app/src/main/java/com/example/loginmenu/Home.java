package com.example.loginmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id = item.getItemId();

        if (id == R.id.add1)
        {
            Toast.makeText( this, "Clicaste en Agregar Libro", Toast.LENGTH_SHORT).show();
        }

        else if (id == R.id.add2)
        {
            Toast.makeText( this, "Clicaste en Agregar Nota", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.logout)
        {
            Toast.makeText(this, "Clicaste en Cerrar Sesion", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}