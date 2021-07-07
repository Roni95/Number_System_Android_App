package xyz.ronitech.numberconversionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static int op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b , o , d, h;
        b= findViewById(R.id.binary);
        o = findViewById(R.id.octal);
        d = findViewById(R.id.decimal);
        h = findViewById(R.id.hexa);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op =1;
                Intent my = new Intent(MainActivity.this, Conversion.class);
                startActivity(my);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op =2;
                Intent myconversion = new Intent(MainActivity.this, Conversion.class);
                startActivity(myconversion);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op =3;
                Intent myconversion = new Intent(MainActivity.this, Conversion.class);
                startActivity(myconversion);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 4;
                Intent myconversion = new Intent(MainActivity.this, Conversion.class);
                startActivity(myconversion);
            }
        });



    }
}