package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal;
    TextView TextViewResultado;

    int valorinicial, valorfinal;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = (EditText)findViewById(R.id.editTextinicial);
        editTextfinal =  (EditText)findViewById(R.id.editTextfinal);
        TextViewResultado = (TextView)findViewById(R.id.TextViewResultado);

    }

    public void Sortear(View v){
        valorinicial = Integer.parseInt (editTextinicial.getText().toString());
        valorfinal = Integer.parseInt(editTextfinal.getText().toString());
        resultado = (int) ((Math.random() * (valorfinal- valorinicial))+valorinicial);
        TextViewResultado.setText("Resultado: "+resultado);
    }
}
