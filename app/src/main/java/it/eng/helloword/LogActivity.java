package it.eng.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        Log.i("HelloWorld","OnCreateMessage");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("HelloWorld","OnStartMessage");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("HelloWorld","OnRestartMessage");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("HelloWorld","OnResumeMessage");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("HelloWorld","OnStopMessage");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("HelloWorld","OnPauseMessage");
    }
}