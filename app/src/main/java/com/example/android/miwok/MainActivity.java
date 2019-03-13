package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** my class training says to use this way to open the NumbersActivity */
    public void openNumbersList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

//    /** I found this way to open the NumbersActivity via StackOverflow */
//    public void openNumbersList (View view){
//        //TODO: your code goes here!
//        Intent NumbersActivity = new Intent(MainActivity.this, NumbersActivity.class);
////        myIntent.putExtra("key", value);//    <-- optional parameters
//        MainActivity.this.startActivity(NumbersActivity);
//    }

}
