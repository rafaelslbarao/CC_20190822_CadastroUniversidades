package br.rafael.cc_20190822_cadastrouniversidades;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btToast;
    private Button btDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Informa para a activity qual será o layout que deverá ser desenhado
        //Para cada objeto(view) do layout um objeto é instanciado da classe
        setContentView(R.layout.activity_main);

        //Busca referencia do objeto criado
        btToast = findViewById(R.id.btToast);
        btDialog = findViewById(R.id.btDialog);

        //Adiciona um evento ao botão e passa a tela como parâmetro
        // A tela deve implementar a interface exigida (View.OnClickListener)
        btToast.setOnClickListener(this);
        btDialog.setOnClickListener(this);
    }

    private void exibeToast(String mensagem)
    {
        Toast toast = Toast.makeText(this, mensagem, Toast.LENGTH_SHORT);
        toast.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void exibeDialog(String mensagem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(mensagem);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                exibeToast("Botão positivo foi clicado");
            }
        });
        builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                exibeToast("Botão negativo foi clicado");
            }
        });
        builder.setNeutralButton("CAFÉ COM LEITE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                exibeToast("Botão atoa foi clicado");
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    /**
     * Método disparado quando é clicado o botão
     */
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btToast:
                exibeToast("Minha mensagem exibida");
                break;
            case R.id.btDialog:
                exibeDialog("Minha mensagem dialog");
                break;
        }
        //
//        if(view.getId() == btToast.getId())
//        {
//            exibeToast("Minha mensagem exibida");
//        }
//        else if(view.getId() == btDialog.getId())
//        {
//            exibeDialog("Minha mensagem dialog");
//        }
    }


}
