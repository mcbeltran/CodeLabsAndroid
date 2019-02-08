package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mShowCount;
    Integer mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "Hello World");

        mCount = 0;
        mShowCount = (TextView) findViewById(R.id.txtCount);
        mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "This is a toast!", Toast.LENGTH_SHORT);

        toast.show();
    }

    public void addCount(View view){
        mCount++;
        mShowCount.setText(Integer.toString(mCount));

    }

}
