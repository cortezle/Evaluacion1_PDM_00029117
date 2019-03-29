package com.example.evalucacionuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evalucacionuno.utils.AppConstant;

import java.util.concurrent.TimeoutException;

public class Main2Activity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private String datos;
    private Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = findViewById(R.id.user);
        tv2 = findViewById(R.id.email);
        tv3 = findViewById(R.id.cont);
        t1 = findViewById(R.id.uno);
        t2 = findViewById(R.id.dos);
        t3 = findViewById(R.id.tres);
        t4 = findViewById(R.id.cuatro);
        t5 = findViewById(R.id.cinco);
        t6 = findViewById(R.id.seis);
        t7 = findViewById(R.id.siete);
        t8 = findViewById(R.id.ocho);
        t9 = findViewById(R.id.nueve);

        Intent mIntent = getIntent();
        Bundle bolsaR = getIntent().getExtras();

        if(mIntent!=null){
            tv1.setText("User:  "+bolsaR.getString(AppConstant.TEXT_KEY));
            tv2.setText("Email:  "+bolsaR.getString(AppConstant.TEXT_KEY2));
            tv3.setText("Total de productos:  "+bolsaR.getString(AppConstant.TEXT_KEY3));

            t1.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY4));
            t2.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY5));
            t3.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY6));
            t4.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY7));
            t5.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY8));
            t6.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY9));
            t7.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY10));
            t8.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY11));
            t9.setText("Producto\n"+ bolsaR.getString(AppConstant.TEXT_KEY12));
        }


        btn_share = findViewById(R.id.btn_share);
        Intent mIntento = getIntent();
        Bundle extras = mIntento.getExtras();
        datos = extras.getString(AppConstant.TEXT_KEY) + "," + extras.getString(AppConstant.TEXT_KEY2) + "," + extras.getString(AppConstant.TEXT_KEY3)
                + "," + extras.getString(AppConstant.TEXT_KEY4)
                + "," + extras.getString(AppConstant.TEXT_KEY5)
                + "," + extras.getString(AppConstant.TEXT_KEY6)
                + "," + extras.getString(AppConstant.TEXT_KEY7)
                + "," + extras.getString(AppConstant.TEXT_KEY8)
                + "," + extras.getString(AppConstant.TEXT_KEY9)
                + "," + extras.getString(AppConstant.TEXT_KEY10)
                + "," + extras.getString(AppConstant.TEXT_KEY11)
                + "," + extras.getString(AppConstant.TEXT_KEY12);


        btn_share.setOnClickListener(v->{
            Intent mIntent2 = new Intent();
            mIntent2.putExtra(Intent.EXTRA_TEXT, datos);
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);

            startActivity(mIntent2);
        });



    }
}
