package com.example.user.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalcHouseActivity extends AppCompatActivity {
double a,b,c,d,e,lic,edu,loan,med,pmcm,other,ded,tottax,cess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_house);
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
        String message1 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE5);
        String message6 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE6);
        String message7 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE7);
        String message8 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE8);
        String message9 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE9);
        String message10 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE10);
        String message11 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE11);
        String message12 = intent.getStringExtra(HouseRentActivity.EXTRA_MESSAGE12);

        try
        {
            a=Double.parseDouble(message1);
            b=Double.parseDouble(message2);
            c=Double.parseDouble(message4);
            d=Double.parseDouble(message5);
            lic=Double.parseDouble(message6);
            edu=Double.parseDouble(message7);
            loan=Double.parseDouble(message8);
            med=Double.parseDouble(message9);
            pmcm=Double.parseDouble(message10);
            other=Double.parseDouble(message11);
            e=Double.parseDouble(message12);
            double tax=a+b+c+d+e;
            double dedc=lic+edu+loan;
            if(dedc>=200000)
            {
                dedc=150000;
                TextView textview13 = (TextView) findViewById(R.id.tex13);
                textview13.setText(dedc+"");
            }
            else
            {
                TextView textview13 = (TextView) findViewById(R.id.tex13);
                textview13.setText(dedc+"");
            }
            TextView textview14 = (TextView) findViewById(R.id.tex14);
            textview14.setText(med+"");
            other=0.5*other;
            TextView textview15 = (TextView) findViewById(R.id.tex15);
            textview15.setText((pmcm+other)+"");
            ded=dedc+med+pmcm+other;
            TextView textview16 = (TextView) findViewById(R.id.tex16);
            textview16.setText((pmcm+other)+"");
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
            TextView textview17 = (TextView) findViewById(R.id.tex17);
            textview17.setText(tottax+"");
            TextView textview18 = (TextView) findViewById(R.id.tex18);
            textview18.setText(cess+"");
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(CalcHouseActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

}
