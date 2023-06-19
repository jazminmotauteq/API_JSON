package com.example.api_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activitybienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitybienvenida);
        //para recibir el mensaje
        TextView txtbienvenida = (TextView)findViewById(R.id.txtbienvenida);
//Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        txtbienvenida.setText("Hola!, Bienvenido \n " +
                bundle.getString("Usuario") +" SU CLAVE ES"
        +bundle.getString("PASSWORD"));
    }


}