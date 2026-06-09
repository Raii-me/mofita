package acom.rai.teste_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import acom.rai.teste_mobile.outros.SidebarTopFuncoes;
import acom.rai.teste_mobile.outros.navbarFuncoes;

public class Tela_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_home);

        navbarFuncoes.setup(this);
        SidebarTopFuncoes.setup(this);



        TextView maiorNota = findViewById(R.id.txt_melhor_nota);
        int maior_Nota = 1000;
        maiorNota.setText("Sua Melhor Nota: " + maior_Nota);

        TextView ultimaNota = findViewById(R.id.txt_ultima_nota);
        int ultima_Nota = 670;
        ultimaNota.setText("Ultima redação nota: " + ultima_Nota);




        findViewById(R.id.btn_modelos).setOnClickListener(v -> startActivity(new Intent(this, Tela_Modelo.class)));
        findViewById(R.id.btn_livro).setOnClickListener(v -> startActivity(new Intent(this, Tela_Livro.class)));



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}