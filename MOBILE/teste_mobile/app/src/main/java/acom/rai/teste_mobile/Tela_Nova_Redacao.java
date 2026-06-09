package acom.rai.teste_mobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import acom.rai.teste_mobile.outros.VoltarTopFuncoes;
import acom.rai.teste_mobile.outros.navbarFuncoes;

public class Tela_Nova_Redacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_nova_redacao);


        navbarFuncoes.setup(this);
        VoltarTopFuncoes.setup(this);

        findViewById(R.id.btn_digitar_redacao).setOnClickListener(v -> startActivity(new Intent(this, Tela_Digitar_Redacao.class)));
        findViewById(R.id.btn_ver_redacao).setOnClickListener(v -> startActivity(new Intent(this, Tela_Continuar_Redacao.class)));




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}