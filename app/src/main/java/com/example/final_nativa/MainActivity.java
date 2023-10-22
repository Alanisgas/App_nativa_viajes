package com.example.final_nativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnIngresar;
    private  Button btnRegistrar;
    private EditText editUsuario;
    private EditText editContrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        editContrasenia= (EditText)findViewById(R.id.edit_Contrasenia);
        editUsuario = (EditText)findViewById(R.id.edit_Usuario);
        btnIngresar.setOnClickListener(ingresar);
        btnRegistrar.setOnClickListener(regitrar);


    }
    private View.OnClickListener ingresar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(MainActivity.this, HomeActivity.class);
            //aca se puede pasar lo que son los valores del usuario para que lo reciba la actividad
            startActivity(intent);
        }

    };
    private View.OnClickListener regitrar= new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

}