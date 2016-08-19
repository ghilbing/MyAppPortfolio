package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6;
    String message;

    public void showToast(View v){

        switch (v.getId()){
            case R.id.button1:
                message = "This button will launch Popular Movies";
                break;

            case R.id.button2:
                message = "This button will launch Stock Hawk";
                break;

            case R.id.button3:
                message = "This button will launch Build it Bigger";
                break;

            case R.id.button4:
                message = "This button will launch Make your App Material";
                break;

            case R.id.button5:
                message = "This button will launch Go Obiquitous";
                break;

            case R.id.button6:
                message = "This button will launch Capstone";
                break;
        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
}
