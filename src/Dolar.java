public class Dolar extends Moeda{
    public Dolar() {
        super();
    }

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        IO.println("Tipo: Dolar");
        System.out.printf("Valor: %.2f \n", this.getValor());
    }

    @Override
    public void converter() {

    }
}
