package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal;
    TextView TextViewResultado;
    ImageButton button;
    int valorinicial, valorfinal;
    int resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = (EditText)findViewById(R.id.editTextinicial);
        editTextfinal =  (EditText)findViewById(R.id.editTextfinal);
        TextViewResultado = (TextView)findViewById(R.id.TextViewResultado);
        button = (ImageButton)findViewById(R.id.button);


    }

    public void Sortear(View v){
        if((editTextinicial.getText().toString().length()>0)&&(editTextfinal.getText().toString().length()>0)){
            valorinicial = Integer.parseInt (editTextinicial.getText().toString());
            valorfinal = Integer.parseInt(editTextfinal.getText().toString());
            resultado = (int) ((Math.random() * (valorfinal- valorinicial))+valorinicial);
            TextViewResultado.setText("Resultado: "+resultado);
        }
        else{
            Toast.makeText(this, "Você deve preencher todos os campos para realizar o sorteio", Toast.LENGTH_SHORT).show();
        }
    }
}
