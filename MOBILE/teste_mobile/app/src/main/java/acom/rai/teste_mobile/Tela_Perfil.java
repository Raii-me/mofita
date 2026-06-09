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

public class Tela_Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_perfil);

        navbarFuncoes.setup(this);

        findViewById(R.id.btn_voltar).setOnClickListener(v -> finish());
        findViewById(R.id.btn_configuracoes).setOnClickListener(v -> startActivity(new Intent(this, Tela_Configuracoes.class)));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}