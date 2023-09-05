package com.example.unitconverter;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        e=findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double p=Double.parseDouble(e.getText().toString());
                double k=(p/1000);
                e.setText(String.format("%2f",k));
                Toast.makeText(MainActivity.this,String.format("%2f",k),Toast.LENGTH_SHORT).show();


            }





        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double p1=Double.parseDouble(e.getText().toString());
                double k1=(p1*1000);
                e.setText(String.format("%2f",k1));
                Toast.makeText(MainActivity.this,String.format("%2f",k1),Toast.LENGTH_SHORT).show();


            }





        });





    }
}