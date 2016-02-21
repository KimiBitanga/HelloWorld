package com.secretproject.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){

        // generate the random integers for r, g and b value
        Random rand = new Random();

        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);

        int backroundColor = Color.rgb(r, g, b);

        int textColor = Color.rgb(255- r, 255 - g, 255 - b);

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setTextColor(textColor);

        View someView = findViewById(R.id.mainLayout);
        View root = someView.getRootView();
        root.setBackgroundColor(backroundColor);
    }
}
