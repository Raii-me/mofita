package acom.rai.teste_mobile.outros;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import acom.rai.teste_mobile.MainActivity;
import acom.rai.teste_mobile.R;
import acom.rai.teste_mobile.Tela_Chatbot;
import acom.rai.teste_mobile.Tela_Continuar_Redacao;
import acom.rai.teste_mobile.Tela_Home;
import acom.rai.teste_mobile.Tela_Nova_Redacao;


public class navbarFuncoes {

    public static void setup(AppCompatActivity activity) {

        activity.findViewById(R.id.btn_home).setOnClickListener(v ->
                activity.startActivity(new Intent(activity, Tela_Home.class)));

        activity.findViewById(R.id.btn_desempenho).setOnClickListener(v ->
                activity.startActivity(new Intent(activity, MainActivity.class)));

        activity.findViewById(R.id.btn_chatbot).setOnClickListener(v ->
                activity.startActivity(new Intent(activity, Tela_Chatbot.class)));

        activity.findViewById(R.id.btn_redacao).setOnClickListener(v ->
                activity.startActivity(new Intent(activity, Tela_Continuar_Redacao.class)));

        activity.findViewById(R.id.btn_main).setOnClickListener(v ->
                activity.startActivity(new Intent(activity, Tela_Nova_Redacao.class)));
    }

}
