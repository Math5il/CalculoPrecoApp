public class Desenvolvedor {

    private String nome;
    private int horasDisponiveisDia;
    private float valorMensalDesejavel;

    public Desenvolvedor(){}

    /***
     * Constructor de desenvolvedor com nome, horas e valor
     * @param nome
     * @param horasDisponiveisDia
     * @param valorMensalDesejavel
     */
    public Desenvolvedor(String nome, int horasDisponiveisDia, float valorMensalDesejavel){
        this.nome = nome;
        this.horasDisponiveisDia = horasDisponiveisDia;
        this.valorMensalDesejavel = valorMensalDesejavel;
    }

    public float calcularValorHora(){
        return valorMensalDesejavel / (horasDisponiveisDia * 20);
    }
    public String getNome() {
        return nome;
    }
}
