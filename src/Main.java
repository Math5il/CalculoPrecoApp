import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int quantidadeHorasTotal = 0;
        ArrayList<ItensSistema> itens = new ArrayList<>();
        Desenvolvedor dev1 = new Desenvolvedor("Matheus Santos", 8, 3200);
        itens.add(new ItensSistema("LoginPage",TipoDeItem.telaComEntradaESaidaDeDados,3));
        itens.add(new ItensSistema("LoginPage2",TipoDeItem.telaComEntradaESaidaDeDados,3));

        for (ItensSistema item : itens) {
            quantidadeHorasTotal += item.esforcoHoras();
        }

        float valorFinal = (quantidadeHorasTotal * dev1.calcularValorHora()) * 1.3f;

        System.out.println("Caro " + dev1.getNome() + ". O valor total do Projeto a ser feito é de: " + valorFinal);
    }
}