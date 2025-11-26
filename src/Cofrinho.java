import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas = new ArrayList<>();

    public void adicionarMoeda(Moeda moeda){
        moedas.add(moeda);
    }
    public void removerMoeda(Moeda moeda){
        moedas.remove(moeda);
    }

    Moeda getMoeda(int num){
        return moedas.get(num -1);
    }
    public void listagemMoeda(){
        for(int i = 0; i < moedas.size(); i++){
            System.out.print(i+1 + " - ");
            moedas.get(i).info();
        }
    }
    public void totalConvertido(){

    Double total = moedas.stream().
            mapToDouble(Moeda::converter).sum();
        System.out.printf("Total convertido: R$%.2f", total);
    }

    public int moedasTamanho(){
        return moedas.size();
    }


}
