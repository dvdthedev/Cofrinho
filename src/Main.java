void main() {

    Moeda real = new Real();
    real.setValor(100.00);

    Cofrinho cofrinho = new Cofrinho();
    cofrinho.adicionarMoeda(real);

    Moeda euro = new Euro(150.00);
    cofrinho.adicionarMoeda(euro);

    cofrinho.listagemMoeda();
    }
