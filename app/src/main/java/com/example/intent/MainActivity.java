package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView v,a;
    int count=0, amount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = (TextView)findViewById(R.id.textView5);
        a = (TextView)findViewById(R.id.textView6);
    }
    public void two(View view)
    {
        count=count+1;
        amount= amount + 100;
        v.setText(Integer.toString(count));
        a.setText(Integer.toString(amount));
    }
    public void four(View view)
    {
        count=count+1;
        amount= amount + 200;
        v.setText(Integer.toString(count));
        a.setText(Integer.toString(amount));
    }
    public void heavy(View view)
    {
        count=count+1;
        amount= amount + 400;
        v.setText(Integer.toString(count));
        a.setText(Integer.toString(amount));
    }
    public void vip(View view)
    {
        count=count+1;
        amount= amount + 0;
        v.setText(Integer.toString(count));
        a.setText(Integer.toString(amount));
    }
    public void rfid(View view)
    {
        count=count+1;
        amount= amount + 50;
        v.setText(Integer.toString(count));
        a.setText(Integer.toString(amount));
    }

}
