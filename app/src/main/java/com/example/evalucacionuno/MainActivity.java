package com.example.evalucacionuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evalucacionuno.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
    private int cont1=1,cont2=1,cont3=1,cont4=1,cont5=1,cont6=1,cont7=1,cont8=1,cont9=1;
    private Button bt1;
    private EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tx1 = findViewById(R.id.uno);
        tx2 = findViewById(R.id.dos);
        tx3 = findViewById(R.id.tres);
        tx4 = findViewById(R.id.cuatro);
        tx5 = findViewById(R.id.cinco);
        tx6 = findViewById(R.id.seis);
        tx7 = findViewById(R.id.siete);
        tx8 = findViewById(R.id.ocho);
        tx9 = findViewById(R.id.nueve);
        bt1 = findViewById(R.id.btn_enviar);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);



        tx1.setOnClickListener(v->{
            tx1.setText("PRODUCTO \n"+ "#"+String.valueOf(cont1++));
        });

        tx2.setOnClickListener(v->{
            tx2.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont2++));
        });


        tx3.setOnClickListener(v->{
            tx3.setText("PRODUCTO \n" +
                    ""+ String.valueOf(cont3++));
        });

        tx4.setOnClickListener(v->{
            tx4.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont4++));
        });
        tx5.setOnClickListener(v->{
            tx5.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont5++));
        });
        tx6.setOnClickListener(v->{
            tx6.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont6++));
        });
        tx7.setOnClickListener(v->{
            tx7.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont7++));
        });
        tx8.setOnClickListener(v->{
            tx8.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont8++));
        });
        tx9.setOnClickListener(v->{
            tx9.setText("PRODUCTO \n" +
                    "#"+ String.valueOf(cont9++));
        });

        bt1.setOnClickListener(v->{

            Intent mIntent = new Intent(MainActivity.this,Main2Activity.class);
            Bundle bolsa = new Bundle();
            bolsa.putString(AppConstant.TEXT_KEY,ed1.getText().toString());
            bolsa.putString(AppConstant.TEXT_KEY2,ed2.getText().toString());
            bolsa.putString(AppConstant.TEXT_KEY3,String.valueOf((cont1-1)+(cont2-1)+(cont3-1)+(cont4-1)+(cont5-1)+(cont6-1)+(cont7-1)+(cont8-1) +(cont9-1)));
            bolsa.putString(AppConstant.TEXT_KEY4,String.valueOf(cont1-1));
            bolsa.putString(AppConstant.TEXT_KEY5,String.valueOf(cont2-1));
            bolsa.putString(AppConstant.TEXT_KEY6,String.valueOf(cont3-1));
            bolsa.putString(AppConstant.TEXT_KEY7,String.valueOf(cont4-1));
            bolsa.putString(AppConstant.TEXT_KEY8,String.valueOf(cont5-1));
            bolsa.putString(AppConstant.TEXT_KEY9,String.valueOf(cont6-1));
            bolsa.putString(AppConstant.TEXT_KEY10,String.valueOf(cont7-1));
            bolsa.putString(AppConstant.TEXT_KEY11,String.valueOf(cont8-1));
            bolsa.putString(AppConstant.TEXT_KEY12,String.valueOf(cont9-1));


            mIntent.putExtras(bolsa);
            startActivity(mIntent);
        });






    }
}
