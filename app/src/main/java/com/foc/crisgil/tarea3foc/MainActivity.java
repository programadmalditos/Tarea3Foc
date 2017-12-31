package com.foc.crisgil.tarea3foc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla=findViewById(R.id.txPantalla);

        Button btnLimpiar=findViewById(R.id.btC);
       btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               pantalla.setText("");
            }
        });

       View.OnClickListener eventoNumeros=new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if(v instanceof  Button){
                   pantalla.setText(((Button)v).getText());


               }


           }
       };

        Button[] btn={
                findViewById(R.id.btCero),
                findViewById(R.id.btUno),
                findViewById(R.id.btDos),
                findViewById(R.id.btTres),
                findViewById(R.id.btCuatro),
                findViewById(R.id.btCinco),
                findViewById(R.id.btSeis),
                findViewById(R.id.btSiete),
                findViewById(R.id.btOcho),
                findViewById(R.id.btNueve),
                findViewById(R.id.btMas),
                findViewById(R.id.btMenos),
                findViewById(R.id.btPor),
                findViewById(R.id.btDividir),
                findViewById(R.id.btIgual)
        };

        for (int i=0;i<btn.length;i++)
            btn[i].setOnClickListener(eventoNumeros);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        pantalla.setText("x:"+x+" y:"+y);

        return true;
    }


}
