package com.example.evalucacionuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.evalucacionuno.utils.AppConstant;

public class Main3Activity extends AppCompatActivity {
    private TextView tv1,tv2,tv3,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private String[] datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1 = findViewById(R.id.user_share);
        tv2 = findViewById(R.id.email_share);
        tv3 = findViewById(R.id.cont_share);
        t1 = findViewById(R.id.uno_share);
        t2 = findViewById(R.id.dos_share);
        t3 = findViewById(R.id.tres_share);
        t4 = findViewById(R.id.cuatro_share);
        t5 = findViewById(R.id.cinco_share);
        t6 = findViewById(R.id.seis_share);
        t7 = findViewById(R.id.siete_share);
        t8 = findViewById(R.id.ocho_share);
        t9 = findViewById(R.id.nueve_share);


        Intent mIntent = getIntent();
        datos = mIntent.getStringExtra(Intent.EXTRA_TEXT).split(",");

        if(mIntent!=null){
            tv1.setText(tv1.getText() + "User:  "+datos[0]);
            tv2.setText(tv2.getText() + "Email:  "+datos[1]);
            tv3.setText(tv3.getText() + "Total de productos:  "+datos[2]);

            t1.setText("Producto \n" + datos[3]);
            t2.setText("Producto \n" + datos[4]);
            t3.setText("Producto \n" + datos[5]);
            t4.setText( "Producto \n" + datos[6]);
            t5.setText( "Producto \n" + datos[7]);
            t6.setText( "Producto \n" + datos[8]);
            t7.setText("Producto \n" + datos[9]);
            t8.setText( "Producto \n" + datos[10]);
            t9.setText( "Producto \n" + datos[11]);
        }
    }
}
