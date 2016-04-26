package com.stevenscheffelaar.simplesecurity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

    private static String logtag = "Simple Security";//for use as the tag when logging

    /** Called when the activity is first created. */

    public void makeRequest(View v) {
        String signal = v.getTag().toString();
        Intent intent = new Intent(this, HTTPRequest.class);
        intent.putExtra("Signal", signal);
        startService(intent);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {//activity is started and visible to the user
        Log.d(logtag,"onStart() called");
        super.onStart();
    }
    @Override
    protected void onResume() {//activity was resumed and is visible again
        Log.d(logtag,"onResume() called");
        super.onResume();

    }
    @Override
    protected void onPause() { //device goes to sleep or another activity appears
        Log.d(logtag,"onPause() called");//another activity is currently running (or user has pressed Home)
        super.onPause();

    }
    @Override
    protected void onStop() { //the activity is not visible anymore
        Log.d(logtag,"onStop() called");
        super.onStop();

    }
    @Override
    protected void onDestroy() {//android has killed this activity
        Log.d(logtag,"onDestroy() called");
        super.onDestroy();
    }
}
