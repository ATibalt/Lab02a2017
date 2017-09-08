package mt.lab02a2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


import mt.lab02a2017.Modelo.Utils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView pedidoActual;
    ToggleButton reserva;
    Switch notificacion;
    Spinner selecHorario;
    RadioButton rbPlato;
    RadioButton rbPostre;
    RadioButton rbBebida;
    Button bAgregar;
    Button bConfirmar;
    Button bPedido;
    ListView listaProductos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pedidoActual = (TextView)findViewById(R.id.pedidoActual);
        reserva = (ToggleButton)findViewById(R.id.toggleButton);
        notificacion = (Switch)findViewById(R.id.switchNotif);
        selecHorario = (Spinner)findViewById(R.id.spinner);
        rbPlato = (RadioButton)findViewById(R.id.rbPlato);
        rbPostre = (RadioButton)findViewById(R.id.rbPostre);
        rbBebida = (RadioButton)findViewById(R.id.rbBebida);
        bAgregar = (Button)findViewById(R.id.bAgregar);
        bConfirmar = (Button)findViewById(R.id.bConfirmar);
        bPedido = (Button)findViewById(R.id.bReset);
        listaProductos = (ListView)findViewById(R.id.listaProductos);

        bConfirmar.setOnClickListener(this);
        bPedido.setOnClickListener(this);
        bAgregar.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bAgregar:
                // do your code
                break;

            case R.id.bReset:
                // do your code
                break;

            case R.id.bConfirmar:
                // do your code
                break;

            default:
                break;
        }

    }
}
