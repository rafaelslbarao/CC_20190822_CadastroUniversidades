package br.rafael.cc_20190822_cadastrouniversidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        carregaInformacoesTela();
    }

    private void carregaInformacoesTela()
    {
        TextView tvTexto = findViewById(R.id.tvTexto);
        MeuCadastro meuCadastro = (MeuCadastro) getIntent().getSerializableExtra(ControladorConteudo.NAME_PARAMETRO);
        //
        tvTexto.setText(meuCadastro.getCodigo().toString() + " " + meuCadastro.getNome());
        //
        tvTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MeuCadastro meuCadastro2 = new MeuCadastro();
                meuCadastro2.setCodigo(2);
                meuCadastro2.setNome("FELIPPE SNOW");
                //
                Intent data = new Intent();
                data.putExtra(ControladorConteudo.NAME_PARAMETRO, meuCadastro2);
                //
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}
