package com.example.user.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SalaryActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE1 = "com.example.user.myapp.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.example.user.myapp.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "com.example.user.myapp.MESSAGE3";
    public final static String EXTRA_MESSAGE4 = "com.example.user.myapp.MESSAGE4";
    public final static String EXTRA_MESSAGE5 = "com.example.user.myapp.MESSAGE5";
    public final static String EXTRA_MESSAGE6 = "com.example.user.myapp.MESSAGE6";
    public final static String EXTRA_MESSAGE7 = "com.example.user.myapp.MESSAGE7";
    public final static String EXTRA_MESSAGE8 = "com.example.user.myapp.MESSAGE8";
    public final static String EXTRA_MESSAGE9 = "com.example.user.myapp.MESSAGE9";
    public final static String EXTRA_MESSAGE10 = "com.example.user.myapp.MESSAGE10";
    public final static String EXTRA_MESSAGE11 = "com.example.user.myapp.MESSAGE11";

    //EditText editText1,editText2,editText3,editText4;
    //Button calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        TextView textView = new TextView(this);
        LinearLayout layout = (LinearLayout) findViewById(R.id.content);
        layout.addView(textView);
    }
    public void sendMessage(View view) {
        Intent calcintent = new Intent(this, CalcActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.edit1);
        EditText editText2 = (EditText) findViewById(R.id.edit2);
        EditText editText3 = (EditText) findViewById(R.id.edit3);
        EditText editText4 = (EditText) findViewById(R.id.edit4);
        EditText editText5 = (EditText) findViewById(R.id.edit5);
        EditText editText6 = (EditText) findViewById(R.id.edit6);
        EditText editText7 = (EditText) findViewById(R.id.edit7);
        EditText editText8 = (EditText) findViewById(R.id.edit8);
        EditText editText9 = (EditText) findViewById(R.id.edit9);
        EditText editText10 = (EditText) findViewById(R.id.edit10);
        EditText editText11 = (EditText) findViewById(R.id.edit11);
        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();
        String message6 = editText6.getText().toString();
        String message7 = editText7.getText().toString();
        String message8 = editText8.getText().toString();
        String message9 = editText9.getText().toString();
        String message10 = editText10.getText().toString();
        String message11 = editText11.getText().toString();
        calcintent.putExtra(EXTRA_MESSAGE1, message1);
        calcintent.putExtra(EXTRA_MESSAGE2, message2);
        calcintent.putExtra(EXTRA_MESSAGE3, message3);
        calcintent.putExtra(EXTRA_MESSAGE4, message4);
        calcintent.putExtra(EXTRA_MESSAGE5, message5);
        calcintent.putExtra(EXTRA_MESSAGE6, message6);
        calcintent.putExtra(EXTRA_MESSAGE7, message7);
        calcintent.putExtra(EXTRA_MESSAGE8, message8);
        calcintent.putExtra(EXTRA_MESSAGE9, message9);
        calcintent.putExtra(EXTRA_MESSAGE10, message10);
        calcintent.putExtra(EXTRA_MESSAGE11, message11);
        startActivity(calcintent);
    }
}
