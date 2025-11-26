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
    public void listagemMoeda(){
        for(Moeda moeda : moedas){
            moeda.info();
        }
    }
    public void totalConvertido(){

    }


}
