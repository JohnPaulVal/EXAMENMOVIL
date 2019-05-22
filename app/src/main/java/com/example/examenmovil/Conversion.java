package com.example.examenmovil;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Conversion extends AppCompatActivity {
    public String tp="",c;
    EditText n,o;
    TextView r;
    public double num,tot;
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        tp = getIntent().getStringExtra("tp");
        c = getIntent().getStringExtra("c");
        et1=(EditText)findViewById(R.id.et1);
        o=(EditText)findViewById(R.id.tx1);
        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(prefe.getString("conversion",""));
        this.setTitle(tp);
    }
    public void Calcular(View v){
        try{
            r=(TextView)findViewById(R.id.tvt);
            n=(EditText)findViewById(R.id.tx1);
            num=Integer.parseInt(n.getText().toString());
            switch (c){
                case "1":
                    tot=(num*9/5)+32;
                    r.setText(tot+" F°");
                    break;
                case "2":
                    tot=(num-32)*5/9;
                    r.setText(tot+" C°");
                    break;
                case "3":
                    tot=num+273.15;
                    r.setText(tot+" K°");
                    break;
                case "4":
                    tot=num-273.15;
                    r.setText(tot+" C°");
                    break;
                case "5":
                    tot=num*10000;
                    r.setText(tot+" m²");
                    break;
                case "6":
                    tot=num/10000;
                    r.setText(tot+" ha");
                    break;
                case "7":
                    tot=num/1000;
                    r.setText(tot+" km");
                    break;
                case "8":
                    tot=num*1000;
                    r.setText(tot+" m²");

                    break;
            }

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"INGRESE UN NUMERO ",Toast.LENGTH_SHORT).show();
        }
        SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("conversion","Numero Anterior : "+o.getText().toString());
        editor.commit();


        //finish();
    }

}
