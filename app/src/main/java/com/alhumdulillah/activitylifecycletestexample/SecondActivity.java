package com.alhumdulillah.activitylifecycletestexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    //Var
    private Button secondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: started.");

        //set title
        setTitle("Second Activity");

        //Initialize Android weight
        secondBtn = findViewById(R.id.secondButton);

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set Up First Activity
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //start Activity
                startActivity(intent);
            }
        });
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "---------onStart------------");
        Toast.makeText(this," On Start Called In Second Activity",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "--------------onResume------------");
        Toast.makeText(this," On Resume Called In Second Activity",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "-----------------onPause---------------");
        Toast.makeText(this," On Pause Called In Second Activity",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "---------------onStop-------------");
        Toast.makeText(this," On Stop Called In Second Activity",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "---------------onDestroy--------------");
        Toast.makeText(this," On Destroy Called In Second Activity",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "-------------------onRestart------------------------");
        Toast.makeText(this," On Destroy Called In Second Activity",Toast.LENGTH_LONG).show();
    }
}