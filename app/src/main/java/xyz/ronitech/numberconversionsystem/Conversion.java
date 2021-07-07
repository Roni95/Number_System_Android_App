package xyz.ronitech.numberconversionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Conversion extends AppCompatActivity {

    private TextView text1,text2,text3,text4,header1,header2,header3,header4;
    private Button con, Back ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        header1 = findViewById(R.id.h1);
        header2 = findViewById(R.id.h2);
        header3 = findViewById(R.id.h3);
        header4 = findViewById(R.id.h4);
        text1 = findViewById(R.id.input);
        text2 = findViewById(R.id.firstanswer);
        text3 = findViewById(R.id.secondanswer);
        text4 = findViewById(R.id.thirdanswer);
        con = findViewById(R.id.convert);
        if(MainActivity.op==1){
            header1.setText("Enter the Binary Number");
            header2.setText("Equivalent Octal Number");
            header3.setText("Equivalent Decimal Number");
            header4.setText("Equivalent Hexa-Decimal Number");
            con.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String value = text1.getText().toString();
                    int decimal = Integer.parseInt(value,2);
                    String octal = Integer.toOctalString(decimal);
                    text2.setText(""+octal);
                    text3.setText(""+decimal);
                    String hex = Integer.toString(decimal,16);
                    text4.setText(""+hex.toUpperCase());
                }
            });
        } else if(MainActivity.op==2){
            header1.setText("Enter the Octal Number");
            header2.setText("Equivalent Binary Number");
            header3.setText("Equivalent Decimal Number");
            header4.setText("Equivalent Hexa-Decimal Number");
            con.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String value = text1.getText().toString();
                    int decimal = Integer.parseInt(value,8);
                    String binary = Integer.toString(decimal,2);
                    text2.setText(""+binary);
                    text3.setText(""+decimal);
                    String hex = Integer.toString(decimal,16);
                    text4.setText(""+hex.toUpperCase());
                }
            });
        } else if(MainActivity.op==3){
            header1.setText("Enter the Decimal Number");
            header2.setText("Equivalent Binary Number");
            header3.setText("Equivalent Octal Number");
            header4.setText("Equivalent Hexa-Decimal Number");
            con.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String value = text1.getText().toString();
                    int decimal = Integer.parseInt(value,10);
                    String binary = Integer.toString(decimal,2);
                    text2.setText(""+binary);
                    String octal = Integer.toString(decimal,8);
                    text3.setText(""+octal);
                    String hex = Integer.toString(decimal,16);
                    text4.setText(""+hex.toUpperCase());
                }
            });
        } else if(MainActivity.op==4){
            header1.setText("Enter the Hexa_Decimal Number");
            header2.setText("Equivalent Binary Number");
            header3.setText("Equivalent Octal Number");
            header4.setText("Equivalent Decimal Number");
            con.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String value = text1.getText().toString();
                    int decimal = Integer.parseInt(value,16);
                    String binary = Integer.toString(decimal,2);
                    text2.setText(""+binary);
                    String octal = Integer.toString(decimal,8);
                    text3.setText(""+octal);
                    text4.setText(""+decimal);
                }
            });
        }

        Back = findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Conversion.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}