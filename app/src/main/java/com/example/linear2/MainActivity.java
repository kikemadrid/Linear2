package com.example.linear2;


import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static int veces_pulsado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        veces_pulsado = 0;
    }

    public void cambioColor (View view) {
        ExtensionLinear linearLayout = (ExtensionLinear)view;



        if(!linearLayout.isUsado()){
            veces_pulsado++;
            linearLayout.setUsado(true);
            Log.d("MIAPP","LO PONEMOS COMO USADO");
            linearLayout.setBackgroundColor(Color.BLACK);
        }else{
            Log.d("MIAPP","YA HA SIDO TOCADA");
        }

        if (veces_pulsado == 6){
            AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
            dialogo.setTitle("Terminado?");
            dialogo.setMessage("Hemos terminado???");
            dialogo.setCancelable(false);
            dialogo.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    finish();//cierro la ventana anterior
                    //finishAffinity();// cierra toda la app
                }
            });
            dialogo.setNegativeButton("Nos", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {


                }
            });
            dialogo.show();
        }
    }


}
