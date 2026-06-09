package acom.rai.teste_mobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import acom.rai.teste_mobile.modelos.ModeloAdapter;
import acom.rai.teste_mobile.modelos.ModeloTema;
import acom.rai.teste_mobile.outros.VoltarTopFuncoes;
import acom.rai.teste_mobile.outros.navbarFuncoes;

public class Tela_Modelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_modelo);

        navbarFuncoes.setup(this);
        VoltarTopFuncoes.setup(this);

        List<ModeloTema> lista = new ArrayList<>();
        lista.add(new ModeloTema(
                "Tema Modelo 1",
                "Origem 1"));

        lista.add(new ModeloTema(
                "Tema Modelo 2",
                "Origem 2"));

        lista.add(new ModeloTema(
                "Tema Modelo 3",
                "Origem 3"));

        //falta fazer a adaptação p/ imagens, a imagem ta padrão ainda...


        RecyclerView recyclerView = findViewById(R.id.recycler_modelos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ModeloAdapter(lista));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}