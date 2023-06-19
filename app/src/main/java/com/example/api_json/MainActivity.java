package com.example.api_json;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //evento que enlaza el boton
    public void limpiar(View view)
    {
//saca la referencia de los controles
        EditText usuario = findViewById(R.id.txtnombre);
        EditText contraseña = findViewById(R.id.txtclave);

        usuario.setText("");
        contraseña.setText("");

    }
    public void login(View view)
    {
        //sacra la referncia
        EditText usuario = findViewById(R.id.txtnombre);
        EditText contraseña = findViewById(R.id.txtclave);
        //se declaran las variables
        String usua;
        String pas;
        //se le asigna la informacion a las variables
        usua= usuario.getText().toString();
        pas= contraseña.getText().toString();
        //
        Bundle b = new Bundle();
        b.putString("Usuario" , usua);
        b.putString("PASSWORD" , pas);
        //para habrir la actividad
        Intent intent = new Intent(MainActivity .this, activitybienvenida.class);
        startActivity(intent);

    }
}