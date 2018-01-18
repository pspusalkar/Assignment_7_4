package com.example.poojajoshi.assignment_7_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get button handle
        Button loginButton = findViewById(R.id.button);
        final EditText editText_userName = findViewById(R.id.editText);

        // set onclick listerner for button
        // Create Intent and set the user enterted name in intent.
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(MainActivity.this, Main2Activity.class);
                Toast t = Toast.makeText(MainActivity.this, editText_userName.getText().toString(), Toast.LENGTH_SHORT);
                t.show();
                String uName = editText_userName.getText().toString();
                mainActivityIntent.putExtra("Üsername", uName);
                startActivity(mainActivityIntent);
            }
        });
    }
}
