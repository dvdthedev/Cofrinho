public class Euro extends Moeda{
    public Euro() {
        super();
    }

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("[Tipo: Euro, Valor: %.2f] \n", this.getValor());
    }

    @Override
    public double converter() {
        return this.getValor() * 6.0;
    }
}
