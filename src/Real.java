public class Real extends Moeda{
    public Real() {
        super();
    }

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("[Tipo: Real, Valor: %.2f] \n", this.getValor());
    }

    @Override
    public double converter() {
        return this.getValor();
    }
}
