package acom.rai.teste_mobile.outros;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import acom.rai.teste_mobile.R;
import acom.rai.teste_mobile.Tela_Configuracoes;
import acom.rai.teste_mobile.Tela_Perfil;

public class SidebarTopFuncoes {
    public static void setup(AppCompatActivity activity){
        activity.findViewById(R.id.menu_sidebar).setOnClickListener(v -> activity.finish());
        activity.findViewById(R.id.menu_perfil).setOnClickListener(v -> activity.startActivity(new Intent(activity, Tela_Perfil.class)));
    }
}
