void main() {

    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Cofrinho cofrinho = new Cofrinho();
    int opcao = 1;

    IO.println("------------------------------------------------");
    IO.println("Bem vindo ao Cofrinho");
    IO.println("------------------------------------------------");
    while (opcao != 0){
        IO.println("Selecione a opção desejada: ");
        IO.println("1 - Adicionar moedas \n2 - Remover moedas\n3 - Listar moedas no cofrinho \n4 - Listar valores convertidos para Real \n0 - Sair");
        opcao = sc.nextInt();
        if(opcao == 0){
            break;
        }
        if(opcao == 1){
            IO.println("Selecione uma opção: \n1 - Real \n2 - Dolar \n3 - Euro\n0 - Sair");
            int opcaoEspecie = sc.nextInt();
            while (opcaoEspecie != 0){
                if(opcaoEspecie > 3 || opcaoEspecie < 0){
                    IO.println("Valor inválido, digite novamente.");
                    opcaoEspecie = sc.nextInt();
                }
                if(opcaoEspecie == 1){
                    IO.println("Digite um valor de depósito maior que 0");
                    double valor = sc.nextDouble();
                    while (0 >= valor){
                        IO.println("Valor inválido, digite um valor de depósito maior que 0");
                        valor = sc.nextDouble();
                    }
                    cofrinho.adicionarMoeda(new Real(valor));
                    break;
                }
                if(opcaoEspecie == 2){
                    IO.println("Digite um valor de depósito maior que 0");
                    double valor = sc.nextDouble();
                    while (0 >= valor){
                        IO.println("Valor inválido, digite um valor de depósito maior que 0");
                        valor = sc.nextDouble();
                    }
                    cofrinho.adicionarMoeda(new Dolar(valor));
                    break;
                }
                if(opcaoEspecie == 3){
                    IO.println("Digite um valor de depósito maior que 0");
                    double valor = sc.nextDouble();
                    while (0 >= valor){
                        IO.println("Valor inválido, digite um valor de depósito maior que 0");
                        valor = sc.nextDouble();
                    }
                    cofrinho.adicionarMoeda(new Euro(valor));
                    break;
                }
            }

        }
        if (opcao == 2){
            IO.println("Digite o número da moeda que deseja retirar do cofre: ");
            IO.println("0 - Abortar operação");
            cofrinho.listagemMoeda();
            int opcaoRemocao = sc.nextInt();
            if(opcaoRemocao == 0){
                IO.println("retornando...");
            } //se o valor de opção for menor que 0 automáticamente será um valor falso!
            else if(opcaoRemocao > cofrinho.moedasTamanho()){
                IO.println("Valor inválido... retornando...");
            } else {
                Moeda moedaEscolhida = cofrinho.getMoeda(opcaoRemocao);
                System.out.print("Moeda escolhida: ");
                moedaEscolhida.info();
                cofrinho.removerMoeda(moedaEscolhida);
                System.out.println("Moeda removida com êxito.");
            }
        }
        if (opcao == 3){
            cofrinho.listagemMoeda();
        }
        if (opcao == 4){
            cofrinho.totalConvertido();
        }
     }
    }
