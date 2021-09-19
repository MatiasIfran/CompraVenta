package com.example.compraventa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private TextView porcentaje;
    private TextView direccion;

    private CheckBox retiroPersona;
    private CheckBox aceptarTerminos;

    private EditText editDireccion;
    private EditText tituloClasificado;
    private EditText precioPublicacion;
    private EditText email;

    private Spinner spinner;

    private SeekBar seekbar;
    private Switch switchEvent;
    private Button publicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtengo las variables de la vista
        switchEvent = (Switch) findViewById(R.id.switch1);
        editDireccion = (EditText) findViewById(R.id.editDireccion);
        tituloClasificado = (EditText) findViewById(R.id.tituloClasificado);
        precioPublicacion = (EditText) findViewById(R.id.editTextNumberDecimal);
        email = (EditText) findViewById(R.id.editCorreo);
        spinner = (Spinner) findViewById(R.id.spinner);
        porcentaje = (TextView)findViewById(R.id.textView8);
        direccion = (TextView)findViewById(R.id.textView6);
        publicar = (Button) findViewById(R.id.button);
        seekbar = (SeekBar)findViewById(R.id.seekBar);

        //asigno valores max y min al seekbar
        seekbar.setProgress(0);
        seekbar.setMax(100);

        retiroPersona = (CheckBox) findViewById(R.id.checkBox);
        aceptarTerminos = (CheckBox) findViewById(R.id.checkBox2);

        publicar = (Button) findViewById(R.id.button);

        Integer porcentajeInt = 0;
        seekbar.setOnSeekBarChangeListener( //funcion para que se ve el porcentaje mientras se mueve
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        porcentaje.setText(String.valueOf(progress));
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) { }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) { }
                }
        );

        publicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = tituloClasificado.getText().toString();
                if("".equals(titulo)){
                   // tituloClasificado.setError("Ingrese el titulo");
                   // tituloClasificado.requestFocus();
                    Toast.makeText(MainActivity.this, "Ingrese el titulo", Toast.LENGTH_LONG).show();
                    return;
                }
                String correo = email.getText().toString();
                if(!validarEmail(correo)){
                    //email.setError("Ingrese un correo electrónico valido");
                    Toast.makeText(MainActivity.this, "Ingrese un correo electrónico valido", Toast.LENGTH_LONG).show();
                    return;
                }
                String precio = precioPublicacion.getText().toString();
                Double numPrecio = 0.0;
                if("".equals(precio)){
                    //precioPublicacion.setError("Ingrese el precio");
                    //precioPublicacion.requestFocus();
                    Toast.makeText(MainActivity.this, "Ingrese el precio", Toast.LENGTH_LONG).show();
                    return;
                }else{
                    numPrecio = Double.parseDouble(precio);
                }
                if(numPrecio<=0){
                    //precioPublicacion.setError("El precio debe ser mayor a 0");
                    //precioPublicacion.requestFocus();
                    Toast.makeText(MainActivity.this, "El precio debe ser mayor a 0", Toast.LENGTH_LONG).show();
                    return;
                }
                if(switchEvent.isChecked()){
                    Integer descuentoEnvio = Integer.parseInt(porcentaje.getText().toString());
                    if(descuentoEnvio==0){
                        //porcentaje.setError("Por favor seleccione un porcentaje mayor a 0 o quite la opcion de ofrecer descuento de envio");
                        //porcentaje.requestFocus();
                        Toast.makeText(MainActivity.this, "Por favor seleccione un porcentaje mayor a 0 o quite la opcion de ofrecer descuento de envio", Toast.LENGTH_LONG).show();
                        return;

                    }
                }
                if(retiroPersona.isChecked()) {
                    String direccionRetiro = editDireccion.getText().toString();
                    if ("".equals(direccionRetiro)) {
                        //editDireccion.setError("Ingrese la direccion de retiro");
                        //editDireccion.requestFocus();
                        Toast.makeText(MainActivity.this, "Ingrese la direccion de retiro", Toast.LENGTH_LONG).show();
                        return;
                    }
                }
                Toast.makeText(MainActivity.this, "Se ha guardado con exito", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void presionSwitch(View view) {
        if(view.getId() == R.id.switch1){
            if(switchEvent.isChecked()){
                porcentaje.setVisibility(View.VISIBLE);
                seekbar.setVisibility(View.VISIBLE);
            }else {
                porcentaje.setVisibility(View.GONE);
                seekbar.setVisibility(View.GONE);
            }
        }
    }

    public void retiroPersona(View view) {
        if(view.getId() == R.id.checkBox){
            if(retiroPersona.isChecked()){
                direccion.setVisibility(View.VISIBLE);
                editDireccion.setVisibility(View.VISIBLE);
            }else{
                direccion.setVisibility(View.GONE);
                editDireccion.setVisibility(View.GONE);
            }
        }
    }

    public void aceptaTerminos(View view) {
        if(view.getId() == R.id.checkBox2){
            publicar.setEnabled(aceptarTerminos.isChecked());
        }
    }

    private boolean validarEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

}