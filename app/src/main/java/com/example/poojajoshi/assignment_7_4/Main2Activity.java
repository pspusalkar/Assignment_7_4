package com.example.poojajoshi.assignment_7_4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // get the text view handle.
        // get the user name form intent
        String username = getIntent().getStringExtra("Üsername");
        TextView textView = findViewById(R.id.textView);
        String welcomeString = "Welcome " + username;
        Toast t = Toast.makeText(Main2Activity.this, welcomeString, Toast.LENGTH_SHORT);
        t.show();

        textView.setText(welcomeString);
    }

}
