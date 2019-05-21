package com.mensajeaveloz.examenprogramovil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.BTNcen_metros);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), AcercaDe.class);
                startActivityForResult(intent, 0);
            }
        });
    }
    public class AcercaDe extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_distancia);

            /*Button btn2 = (Button) findViewById(R.id.botonact2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                    startActivityForResult(intent2, 0);
                }
            });*/
        }
    }



        EditText campoNombre = (EditText) findViewById(R.id.textinvi);
        TextView nom = (TextView) findViewById(R.id.Principal);

        public void evento (View view)
        {
            switch (view.getId()) {
                case R.id.BTNcen_metros:
                    String nombre = campoNombre.getText().toString();
                    campoNombre.setText(nombre);
            }
        }

}
