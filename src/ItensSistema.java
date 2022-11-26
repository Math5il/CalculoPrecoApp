public class ItensSistema {

    private String nome;
    private TipoDeItem tipo;
    private int grauDificuldade;

    public ItensSistema(){}

    public ItensSistema(String nome, TipoDeItem tipo, int grauDificuldade){
        this.nome = nome;
        this.tipo = tipo;
        this.grauDificuldade = grauDificuldade;
    }

    public int esforcoHoras() {
        if(tipo.equals(TipoDeItem.telaComEntradaESaidaDeDados)){
            switch (grauDificuldade){
                case 1 : return 8;
                case 2 : return 12;
                case 3 : return 16;
            }
        }else if(tipo.equals(TipoDeItem.telaDeConsulta)){
            switch (grauDificuldade){
                case 1 : return 4;
                case 2 : return 6;
                case 3 : return 8;
            }
        } else if(tipo.equals(TipoDeItem.gravacaoDeDados)){
            switch (grauDificuldade){
                case 1 : return 16;
                case 2 : return 24;
                case 3 : return 36;
            }
        } else if(tipo.equals(TipoDeItem.AlgoritimosDeProcessamento)){
            switch (grauDificuldade){
                case 1 : return 10;
                case 2 : return 20;
                case 3 : return 30;
            }
        }
        return 0;
    }
}
