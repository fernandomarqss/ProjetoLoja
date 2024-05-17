import java.util.Scanner;

public class LojaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();

        while (true) {
            System.out.println("\n--- Loja Virtual ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto");
            System.out.println("4. Adicionar Promoção");
            System.out.println("5. Calcular Total da Compra");
            System.out.println("6. Sair");
            System.out.print("Selecione uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n do buffer

            switch (opcao) {
                case 1:
                    cadastrarProduto(scanner, loja);
                    break;
                case 2:
                    loja.listarProdutos();
                    break;
                case 3:
                    buscarProduto(scanner, loja);
                    break;
                case 4:
                    adicionarPromocao(scanner, loja);
                    break;
                case 5:
                    calcularTotalCompra(loja);
                    break;
                case 6:
                    System.out.println("Saindo da loja...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarProduto(Scanner scanner, Loja loja) {
        System.out.println("\n--- Cadastrar Produto ---");
        System.out.print("Digite o tipo de produto (1 - Televisão, 2 - Smartphone, 3 - Notebook): ");
        int tipoProduto = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n do buffer

        Produto produto = null;

        switch (tipoProduto) {
            case 1:
                produto = criarTelevisao(scanner);
                break;
            case 2:
                produto = criarSmartphone(scanner);
                break;
            case 3:
                produto = criarNotebook(scanner);
                break;
            default:
                System.out.println("Tipo de produto inválido.");
                return;
        }

        if (produto != null) {
            loja.cadastrarProduto(produto);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }

    private static Televisao criarTelevisao(Scanner scanner) {
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n do buffer
        System.out.print("Digite o tipo de tela: ");
        String tipoTela = scanner.nextLine();
        System.out.print("Digite o tamanho da tela: ");
        double tamanhoTela = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n do buffer
        return new Televisao(marca, modelo, preco, tipoTela, tamanhoTela);
    }

    private static Smartphone criarSmartphone(Scanner scanner) {
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n do buffer
        System.out.print("Digite o tipo de tela: ");
        String tipoTela = scanner.nextLine();
        System.out.print("Digite a memória RAM: ");
        int memoriaRAM = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n do buffer
        System.out.print("Digite o armazenamento interno: ");
        int armazenamentoInterno = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n do buffer
        return new Smartphone(marca, modelo, preco, tipoTela, memoriaRAM, armazenamentoInterno);
    }

    private static Notebook criarNotebook(Scanner scanner) {
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n do buffer
        System.out.print("Digite o tipo de tela: ");
        String tipoTela = scanner.nextLine();
        System.out.print("Digite o processador: ");
        String processador = scanner.nextLine();
        System.out.print("Digite o sistema operacional: ");
        String sistemaOperacional = scanner.nextLine();
        return new Notebook(marca, modelo, preco, tipoTela, processador, sistemaOperacional);
    }

    private static void buscarProduto(Scanner scanner, Loja loja) {
        System.out.print("\n--- Buscar Produto ---");
        System.out.print("Digite o modelo do produto: ");
        String modelo = scanner.nextLine();
        Produto produto = loja.buscarProduto(modelo);
        if (produto != null) {
            System.out.println("Produto encontrado: " + produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void adicionarPromocao(Scanner scanner, Loja loja) {
        System.out.println("\n--- Adicionar Promoção ---");
        System.out.print("Digite o tipo de promoção (1 - Desconto por Porcentagem, 2 - Desconto Fixo): ");
        int tipoPromocao = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n do buffer

        Descontavel promocao = null;

        switch (tipoPromocao) {
            case 1:
                promocao = criarPromocaoDescontoPorcentagem(scanner);
                break;
            case 2:
                promocao = criarPromocaoDescontoFixo(scanner);
                break;
            default:
                System.out.println("Tipo de promoção inválido.");
                return;
        }

        if (promocao != null) {
            loja.adicionarPromocao(promocao);
            System.out.println("Promoção adicionada com sucesso!");
        }
    }

    private static PromocaoDescontoPorcentagem criarPromocaoDescontoPorcentagem(Scanner scanner) {
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n do buffer
        return new PromocaoDescontoPorcentagem(porcentagemDesconto);
    }

    private static PromocaoDescontoFixo criarPromocaoDescontoFixo(Scanner scanner) {
        System.out.print("Digite o valor do desconto: ");
        double valorDesconto = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n do buffer
        return new PromocaoDescontoFixo(valorDesconto);
    }

    private static void calcularTotalCompra(Loja loja) {
        System.out.println("\n--- Total da Compra ---");
        double totalCompra = loja.calcularTotalCompra();
        System.out.println("Total da compra: R$" + totalCompra);
    }
}