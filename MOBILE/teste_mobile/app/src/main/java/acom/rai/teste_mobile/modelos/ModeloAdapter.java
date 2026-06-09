package acom.rai.teste_mobile.modelos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import acom.rai.teste_mobile.R;

public class ModeloAdapter extends RecyclerView.Adapter<ModeloAdapter.ViewHolder> {

    private List<ModeloTema> lista;

    public ModeloAdapter(List<ModeloTema> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.component_card_modelos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModeloTema item = lista.get(position);
        holder.txtNome.setText(item.getNomeTema());
        holder.txtOrigem.setText(item.getOrigemTema());

        //falta por a imagem, mas ta padrão ent se vira ai paizão

    }

    @Override
    public int getItemCount() { return lista.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNome, txtOrigem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.txt_nome_tema);
            txtOrigem = itemView.findViewById(R.id.txt_origem_tema);
        }
    }
}