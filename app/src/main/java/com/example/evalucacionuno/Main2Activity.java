package com.example.evalucacionuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.evalucacionuno.utils.AppConstant;

import java.util.concurrent.TimeoutException;

public class Main2Activity extends AppCompatActivity {

    private TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = findViewById(R.id.user);
        tv2 = findViewById(R.id.email);
        tv3 = findViewById(R.id.cont);
        Intent mIntent = getIntent();
        Bundle bolsaR = getIntent().getExtras();

        if(mIntent!=null){
            tv1.setText("User:  "+bolsaR.getString(AppConstant.TEXT_KEY));
            tv2.setText("Password:  "+bolsaR.getString(AppConstant.TEXT_KEY2));
            tv3.setText("Contador:  "+bolsaR.getString(AppConstant.TEXT_KEY3));
        }

    }
}
