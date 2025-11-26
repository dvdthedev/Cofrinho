public class Real extends Moeda{
    public Real() {
        super();
    }

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        IO.println("Tipo: Real");
        System.out.printf("Valor: %.2f \n", this.getValor());
    }

    @Override
    public void converter() {

    }
}
