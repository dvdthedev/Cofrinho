public class Dolar extends Moeda{
    public Dolar() {
        super();
    }

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("[Tipo: Dolar, Valor: %.2f] \n", this.getValor());
    }

    @Override
    public double converter() {
        return this.getValor() * 5.0;
    }
}
