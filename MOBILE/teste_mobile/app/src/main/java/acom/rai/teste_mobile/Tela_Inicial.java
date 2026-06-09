package acom.rai.teste_mobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela_Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_inicial);




        findViewById(R.id.btn_cadastrar).setOnClickListener(v -> startActivity(new Intent(this, Tela_Criar_Conta.class)));
        findViewById(R.id.btn_entrar).setOnClickListener(v -> startActivity(new Intent(this, Tela_Login.class)));
        findViewById(R.id.btn_termos).setOnClickListener(v -> startActivity(new Intent(this, Tela_Termos.class)));
        findViewById(R.id.btn_politicas).setOnClickListener(v -> startActivity(new Intent(this, Tela_Politica.class)));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}