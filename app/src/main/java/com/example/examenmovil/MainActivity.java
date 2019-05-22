package com.example.examenmovil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public String tp="",c="";
    public Button cf,fc,ck,kc,hm,mh,mk,km;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uno(View v){
        cf=(Button)findViewById(R.id.bt1);
        tp=cf.getText().toString();
        c="1";
        CambioPantalla();
    }
    public void dos(View v){
        fc=(Button)findViewById(R.id.bt2);
        tp=fc.getText().toString();
        c="2";
        CambioPantalla();
    }
    public void tres(View v){
        ck=(Button)findViewById(R.id.bt3);
        tp=ck.getText().toString();
        c="3";
        CambioPantalla();
    }
    public void cuatro(View v){
        kc=(Button)findViewById(R.id.bt4);
        tp=kc.getText().toString();
        c="4";
        CambioPantalla();
    }
    public void cinco(View v){
        hm=(Button)findViewById(R.id.btn5);
        tp=hm.getText().toString();
        c="5";
        CambioPantalla();
    }
    public void seis(View v){
        mh=(Button)findViewById(R.id.bt6);
        tp=mh.getText().toString();
        c="6";
        CambioPantalla();
    }
    public void siete(View v){
        mk=(Button)findViewById(R.id.btn7);
        tp=mk.getText().toString();
        c="7";
        CambioPantalla();
    }
    public void ocho(View v){
        km=(Button)findViewById(R.id.btn8);
        tp=km.getText().toString();
        c="8";
        CambioPantalla();
    }
    public void CambioPantalla(){
        Intent Ventana=new Intent(getApplicationContext(),Conversion.class);
        Ventana.putExtra("tp",tp);
        Ventana.putExtra("c",c);
        startActivity(Ventana);
    }


}
