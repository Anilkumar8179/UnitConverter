package com.anilkumar.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView convert, value;
    EditText enterValue;
    Button convertNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert=findViewById(R.id.Convert);
        value=findViewById(R.id.value);
        enterValue=findViewById(R.id.enterValue);
        convertNow=findViewById(R.id.convertNow);
        convertNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double kilos =Double.parseDouble(enterValue.getText().toString());


                value.setText( ""+ ConvertTopounds(kilos));

            }
        });
    }

    public double ConvertTopounds(double kilos){

        double pound_result= kilos*2.20462;
        return pound_result;

    }
}