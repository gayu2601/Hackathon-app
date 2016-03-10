package com.example.user.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HouseRentActivity extends AppCompatActivity {
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
    public final static String EXTRA_MESSAGE12 = "com.example.user.myapp.MESSAGE12";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_rent);
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
    public void Calc(View view) {
        Intent calintent = new Intent(this, CalcHouseActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.edi1);
        EditText editText2 = (EditText) findViewById(R.id.edi2);
        EditText editText3 = (EditText) findViewById(R.id.edi3);
        EditText editText4 = (EditText) findViewById(R.id.edi4);
        EditText editText5 = (EditText) findViewById(R.id.edi5);
        EditText editText6 = (EditText) findViewById(R.id.edi6);
        EditText editText7 = (EditText) findViewById(R.id.edi7);
        EditText editText8 = (EditText) findViewById(R.id.edi8);
        EditText editText9 = (EditText) findViewById(R.id.edi9);
        EditText editText10 = (EditText) findViewById(R.id.edi10);
        EditText editText11 = (EditText) findViewById(R.id.edi11);

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

        double nav;
        double hl=Double.parseDouble(message1);
        double gal;
        double mv=Double.parseDouble(message2);
        double rent=Double.parseDouble(message3);
        double mtct=Double.parseDouble(message4);
        double hlint=Double.parseDouble(message5);
        if (mv <= rent) {
            gal=rent;
            nav=mtct-gal;
            TextView textview1 = (TextView) findViewById(R.id.tex1);
            textview1.setText(gal+"");
            TextView textview2 = (TextView) findViewById(R.id.tex2);
            textview2.setText(nav+"");
        } else {
            gal=mv;
            nav=mtct-gal;
            TextView textview1 = (TextView) findViewById(R.id.tex1);
            textview1.setText(gal+"");
            TextView textview2 = (TextView) findViewById(R.id.tex2);
            textview2.setText(nav+"");
        }
        String message12=String.valueOf(nav);

        double repairs=0.2*nav;
        TextView textview3 = (TextView) findViewById(R.id.tex3);
        textview3.setText(repairs+"");

            calintent.putExtra(EXTRA_MESSAGE1, message1);
            calintent.putExtra(EXTRA_MESSAGE3, message2);
        calintent.putExtra(EXTRA_MESSAGE3, message3);
            calintent.putExtra(EXTRA_MESSAGE4, message4);
            calintent.putExtra(EXTRA_MESSAGE5, message5);
            calintent.putExtra(EXTRA_MESSAGE12, message12);

        calintent.putExtra(EXTRA_MESSAGE6, message6);
        calintent.putExtra(EXTRA_MESSAGE7, message7);
        calintent.putExtra(EXTRA_MESSAGE8, message8);
        calintent.putExtra(EXTRA_MESSAGE9, message9);
        calintent.putExtra(EXTRA_MESSAGE10, message10);
        calintent.putExtra(EXTRA_MESSAGE11, message11);
        startActivity(calintent);

    }
}
