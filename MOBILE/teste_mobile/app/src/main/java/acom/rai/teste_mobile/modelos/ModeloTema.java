package acom.rai.teste_mobile.modelos;

public class ModeloTema {

    private String nomeTema;
    private String origemTema;

    public ModeloTema(String nomeTema, String origemTema) {
        this.nomeTema = nomeTema;
        this.origemTema = origemTema;
    }

    public String getNomeTema() { return nomeTema; }
    public String getOrigemTema() { return origemTema; }
}
