package com.mensajeaveloz.examenprogramovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Distancia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distancia);
        try {
            Button BTN_metros = (Button) findViewById(R.id.METROS);
            final EditText edit_cm = (EditText) findViewById(R.id.editText);
            final EditText edit_metros = (EditText) findViewById(R.id.Resultado);
            BTN_metros.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String skm = edit_cm.getText().toString();
                    float cm = Float.parseFloat(skm);
                    float mt = cm / 1000f;
                    String smillas = String.format("%f", mt);
                    edit_metros.setText(smillas);
                }
            });
        }
        catch (Exception e)
            {
                Toast.makeText(getApplicationContext(), "pon un número!!", Toast.LENGTH_SHORT).show();
            }
    }
}
