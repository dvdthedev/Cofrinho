public class Euro extends Moeda{
    public Euro() {
        super();
    }

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        IO.println("Tipo: Euro");
        System.out.printf("Valor: %.2f \n", this.getValor());
    }

    @Override
    public void converter() {

    }
}
