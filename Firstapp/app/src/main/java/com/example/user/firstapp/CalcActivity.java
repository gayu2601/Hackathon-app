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
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {
    double basic=0,hra=0,ta=0,oa=0,rp=0,hrat=0,tat=0,lic,edu,loan,med,pmcm,other,ded,tottax,cess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
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
        String message1 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE5);
        String message6 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE6);
        String message7 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE7);
        String message8 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE8);
        String message9 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE9);
        String message10 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE10);
        String message11 = intent.getStringExtra(SalaryActivity.EXTRA_MESSAGE11);

        TextView textview1 = (TextView) findViewById(R.id.text1);
        TextView textview2 = (TextView) findViewById(R.id.text2);
        TextView textview3 = (TextView) findViewById(R.id.text3);
        TextView textview4 = (TextView) findViewById(R.id.text4);
        textview1.setText(message1);
        textview2.setText(message2);
        textview3.setText(message3);
        textview4.setText(message4);

        try {
            basic = Double.parseDouble(message1);
            hra = Double.parseDouble(message2);
            ta = Double.parseDouble(message3);
            oa = Double.parseDouble(message4);
            rp=Double.parseDouble(message5);
            lic=Double.parseDouble(message6);
            edu=Double.parseDouble(message7);
            loan=Double.parseDouble(message8);
            med=Double.parseDouble(message9);
            pmcm=Double.parseDouble(message10);
            other=Double.parseDouble(message11);
            String ba = "0";
            TextView textview5 = (TextView) findViewById(R.id.text5);
            textview5.setText(ba);
            double hr = rp - (0.1 * basic);
            if (hr <= hra) {
                TextView textview6 = (TextView) findViewById(R.id.text6);
                textview6.setText(hr+"");
            } else {
                TextView textview6 = (TextView) findViewById(R.id.text6);
                textview6.setText(hra+"");
            }
            String t = "9600";
            TextView textview7 = (TextView) findViewById(R.id.text7);
            textview7.setText(t);
            String o = "0";
            TextView textview8 = (TextView) findViewById(R.id.text8);
            textview8.setText(o);
            TextView textview9 = (TextView) findViewById(R.id.text9);
            textview9.setText(basic+"");
            hrat=hra-hr;
            TextView textview10 = (TextView) findViewById(R.id.text10);
            textview10.setText(hrat+"");
            tat=ta-9600;
            TextView textview11 = (TextView) findViewById(R.id.text11);
            textview11.setText(tat+"");
            TextView textview12 = (TextView) findViewById(R.id.text12);
            textview12.setText(oa+"");
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(CalcActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
    public void Calculate(View view) {
        double tax=basic+hrat+tat+oa;
        double dedc=lic+edu+loan;
        if(dedc>=150000)
        {
            dedc=150000;
            TextView textview13 = (TextView) findViewById(R.id.text13);
            textview13.setText(dedc+"");
        }
        else
        {
            TextView textview13 = (TextView) findViewById(R.id.text13);
            textview13.setText(dedc+"");
        }
        if(med>=25000) {
            med=25000;
            TextView textview14 = (TextView) findViewById(R.id.text14);
            textview14.setText(med + "");
        }
        else
        {
            TextView textview14 = (TextView) findViewById(R.id.text14);
            textview14.setText(med + "");
        }
        other=0.5*other;
        TextView textview15 = (TextView) findViewById(R.id.text15);
        textview15.setText((pmcm+other)+"");
        ded=dedc+med+pmcm+other;
        TextView textview16 = (TextView) findViewById(R.id.text16);
        textview16.setText((ded)+"");
        if((tax-ded)<=500000)
        {
            tottax=(tax-250000)*0.1;
        }
        else if((tax-ded)>500000)
        {
            tottax=25000+((tax-500000)*0.2);
        }
        else
        {
            tottax=125000+((tax-1000000)*0.3);
        }
        cess=tottax*0.03;
        TextView textview17 = (TextView) findViewById(R.id.text17);
        textview17.setText(tottax+"");
        TextView textview18 = (TextView) findViewById(R.id.text18);
        textview18.setText(cess+"");
        double totinc=basic+hrat+tat+oa;
        TextView textview20 = (TextView) findViewById(R.id.text20);
        textview20.setText(totinc+"");
    }
}
