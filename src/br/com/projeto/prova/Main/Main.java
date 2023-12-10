package br.com.projeto.prova.Main;

import br.com.projeto.prova.Controll.*;
import br.com.projeto.prova.Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ---- RESTAURANTE ---- ");
        System.out.println("Digite o nome do restaurante: ");
        String nomeDoRestaurante = sc.nextLine();
        System.out.println("Digite o tipo de cozinha: ");
        String tipoDeCozinha = sc.nextLine();
        System.out.println("O restaurante abre finais de semana?");
        String abreFinsDeSemana = sc.nextLine();
        System.out.println("Digite em qual turno funciona o restaurante: ");
        String turno = sc.nextLine();

        Restaurante restaurante = new Restaurante(nomeDoRestaurante, tipoDeCozinha, abreFinsDeSemana, turno);

        System.out.println("\nCadastro do entregador: ");
        System.out.println("Digite o nome do entregador: ");
        String nomeDoEntregador1 = sc.nextLine();
        System.out.println("Digite o id do entregador");
        int idEntregador1 = sc.nextInt();
        System.out.println("Digite a idade do entregador: ");
        int idade1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a cor da moto do entregador");
        String corDaMoto1 = sc.nextLine();
        System.out.println("------------------");

        Entregador entregador1 = new Entregador(nomeDoEntregador1, idEntregador1, idade1, corDaMoto1);
        EntregadorController entregadorController = new EntregadorController();
        entregadorController.adicionar(entregador1);

        System.out.println("\nCadastro do entregador: ");
        System.out.println("Digite o nome do entregador : ");
        String nomeDoEntregador2 = sc.nextLine();
        System.out.println("Digite o id do entregador: ");
        int idEntregador2 = sc.nextInt();
        System.out.println("Digite a idade do entregador: ");
        int idade2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a cor da moto do entregador: ");
        String corDaMoto2 = sc.nextLine();
        System.out.println("------------------");

        Entregador entregador2 = new Entregador(nomeDoEntregador2, idEntregador2, idade2, corDaMoto2);
        entregadorController.adicionar(entregador2);


        System.out.println("\nCadastro de funcionario: ");
        System.out.println("Digite o nome do funcionário: ");
        String nomeDoFuncionario1 = sc.nextLine();
        System.out.println("Digite o ID do funcionário: ");
        int idDoFuncionario1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a idade do funcionário");
        int idadeDoFunciomario1 = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");

        Funcionario funcionario1 = new Funcionario(nomeDoFuncionario1, idDoFuncionario1, idadeDoFunciomario1);

        FuncionarioController funcionarioController = new FuncionarioController();
        funcionarioController.adicionar(funcionario1);

        System.out.println("\nCadastro de funcionario: ");
        System.out.println("Digite o nome do funcionário: ");
        String nomeDoFuncionario2 = sc.nextLine();
        System.out.println("Digite o ID do funcionário: ");
        int idDoFuncionario2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a idade do funcionário");
        int idadeDoFunciomario2 = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");

        Funcionario funcionario2 = new Funcionario(nomeDoFuncionario2, idDoFuncionario2, idadeDoFunciomario2);
        funcionarioController.adicionar(funcionario2);


        System.out.println("\nCadastro de cliente: ");
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite endereço do cliente");
        String endereco = sc.nextLine();
        System.out.println("Digite o id do cliente: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");

        Cliente cliente0 = new Cliente(nome, endereco, id);
        ClienteController clienteController = new ClienteController();
        clienteController.adicionar(cliente0);


        System.out.println("\nCadastro de cliente: ");
        System.out.println("Digite o nome do cliente: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite endereço do cliente");
        String endereco1 = sc.nextLine();
        System.out.println("Digite o id do cliente: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");

        Cliente cliente1 = new Cliente(nome1, endereco1, id1);
        clienteController.adicionar(cliente1);

        System.out.println("\nCadastro do pedido: ");
        System.out.println("Digite o que o cliente " + cliente0.getNome() + " pediu: ");
        String pedido = sc.nextLine();
        System.out.println("Digite o valor do pedido:  ");
        double valorDoPedido = sc.nextDouble();
        System.out.println("Digite o ID do pedido: ");
        int IdPedido = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");


        Pedido pedido0 = new Pedido(pedido, valorDoPedido, IdPedido);
        PedidoController pedidoController = new PedidoController();
        pedidoController.adicionar(pedido0);

        System.out.println("\nCadastro do pedido: ");
        System.out.println("Digite o que o Cliente " + cliente0.getNome() + " pediu: ");
        String pedido2 = sc.nextLine();
        System.out.println("Digite o valor do pedido: ");
        double valorDoPedido2 = sc.nextDouble();
        System.out.println("Digite o ID do pedido: ");
        int IdPedido2 = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");


        Pedido pedido1 = new Pedido(pedido2, valorDoPedido2, IdPedido2);
        pedidoController.adicionar(pedido1);

        System.out.println("\nCadastro do pedido: ");
        System.out.println("Digite o que o Cliente " + cliente1.getNome() + " pediu: ");
        String pedido3 = sc.nextLine();
        System.out.println("Digite o valor do pedido: ");
        double valorDoPedido3 = sc.nextDouble();
        System.out.println("Digite o ID do pedido: ");
        int IdPedido3 = sc.nextInt();
        sc.nextLine();
        System.out.println("------------------");


        Pedido pedido02 = new Pedido(pedido3, valorDoPedido3, IdPedido3);
        pedidoController.adicionar(pedido02);


        RelacionamentoPedidoClienteController relacionamentoPedidoClienteController =
                new RelacionamentoPedidoClienteController();
        relacionamentoPedidoClienteController.associarPedidoCliente(cliente0, pedido0);
        relacionamentoPedidoClienteController.associarPedidoCliente(cliente0, pedido1);
        relacionamentoPedidoClienteController.exibirPedidosDoCliente(cliente0);
        relacionamentoPedidoClienteController.calcularValorTotalPedidosCliente(cliente0);
        relacionamentoPedidoClienteController.associarPedidoCliente(cliente1, pedido02);
        relacionamentoPedidoClienteController.exibirPedidosDoCliente(cliente1);
        relacionamentoPedidoClienteController.calcularValorTotalPedidosCliente(cliente1);


        System.out.println("\nLembrete: só aceitamos Cartão e Dinheiro como forma de pagamento");
        System.out.println("Forma de pagamento do cliente " + cliente0.getNome());
        String formaDePagamento = sc.nextLine().toLowerCase();
        System.out.println("Valor total: ");
        double valorTotalDosPedidosDoCliente = sc.nextDouble();
        System.out.println("Digite o id do pagamento: ");
        int idDoPagamento = sc.nextInt();
        int numeroDoCartao = 0;
        sc.nextLine();
        if (formaDePagamento.contains("cartao")) {
            System.out.println("Digite o número do cartão do cliente");
            numeroDoCartao = sc.nextInt();

        }

        Pagamento pagamento = new Pagamento(formaDePagamento, numeroDoCartao, valorTotalDosPedidosDoCliente,
                idDoPagamento);


        System.out.println("\nLembrete: só aceitamos Cartão e Dinheiro como forma de pagamento");
        System.out.println("Forma de pagamento do cliente " + cliente1.getNome());
        String formaDePagamento1 = sc.nextLine();
        System.out.println("Valor total: ");
        double valorTotalDosPedidosDoCliente1 = sc.nextDouble();
        System.out.println("Digite o id do pagamento: ");
        int idDoPagamento1 = sc.nextInt();
        int numeroDoCartao1 = 0;

        if (formaDePagamento1.contains("cartao")) {
            System.out.println("Digite o número do cartão do cliente");
            numeroDoCartao1 = sc.nextInt();
            sc.nextLine();
        }
        Pagamento pagamento2 = new Pagamento(formaDePagamento1, numeroDoCartao1, valorTotalDosPedidosDoCliente1,
                idDoPagamento1);


        RelacionamentoPagamentoClienteController relacionamentoPagamentoClienteController =
                new RelacionamentoPagamentoClienteController();
        relacionamentoPagamentoClienteController.associarPagamentoCliente(idDoPagamento, id);
        relacionamentoPagamentoClienteController.associarPagamentoCliente(idDoPagamento1, id1);

        PagamentoController pagamentoController = new PagamentoController(relacionamentoPedidoClienteController,
                relacionamentoPagamentoClienteController, clienteController);
        pagamentoController.adicionar(pagamento);
        pagamentoController.adicionar(pagamento2);


        System.out.println("\nCadastro entrega: ");
        System.out.println("Digite o ID do entregador que fez a entrega do cliente " + cliente0.getNome());
        int idEntregadorDaEntrega = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o tipo de entrega feito: ");
        String tipoDeEntrega = sc.nextLine();
        System.out.println("Digite o id da entrega: ");
        int idEntrega = sc.nextInt();
        sc.nextLine();

        Entrega entrega1 = new Entrega(idEntregadorDaEntrega, tipoDeEntrega, idEntrega);


        System.out.println("\nCadastro entrega: ");
        System.out.println("Digite o ID do entregador que fez a entrega do cliente " + cliente1.getNome() + ":");
        int iDEntregadorDaEntrega2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o tipo de entrega feito: ");
        String tipoDeEntrega2 = sc.nextLine();
        System.out.println("Digite o id da entrega: ");
        int idEntrega2 = sc.nextInt();

        Entrega entrega2 = new Entrega(iDEntregadorDaEntrega2, tipoDeEntrega2, idEntrega2);

        EntregaController entregaController = new EntregaController(entregadorController);

        entregaController.definirPagamento(pagamento);
        entregaController.adicionar(entrega1);
        entregaController.definirPagamento(pagamento2);
        entregaController.adicionar(entrega2);

        System.out.println("\nCadastro de avaliação");
        System.out.println("Digite o id da avaliação: ");
        int idAvaliacao1 = sc.nextInt();
        System.out.println("Digite a nota: ");
        double notaAvaliacao1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o comentário do cliente: ");
        String comentario1 = sc.nextLine();

        Avaliacao avaliacao1 = new Avaliacao(idAvaliacao1, notaAvaliacao1, comentario1);

        AvaliacaoController avaliacaoController = new AvaliacaoController();
        avaliacaoController.adicionar(avaliacao1);

        System.out.println("\nCadastro de avaliação");
        System.out.println("Digite o id da avaliação: ");
        int idAvaliacao2 = sc.nextInt();
        System.out.println("Digite a nota: ");
        double notaAvaliacao2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o comentário do cliente: ");
        String comentario2 = sc.nextLine();


        Avaliacao avaliacao2 = new Avaliacao(idAvaliacao2, notaAvaliacao2, comentario2);
        avaliacaoController.adicionar(avaliacao2);

        restaurante.ExibirRestaurante();


        int opcao;

        do {
            System.out.println("Digite a opção que deseja manusear:");
            System.out.println("1 - Cliente");
            System.out.println("2 - Entrega");
            System.out.println("3 - Entregador");
            System.out.println("4 - Funcionario");
            System.out.println("5 - Pagamento");
            System.out.println("6 - Pedido");
            System.out.println("7 - Avaliação");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Menu de Cliente:");
                    System.out.println("1 - Buscar cliente por ID");
                    System.out.println("2 - Remover cliente");
                    System.out.println("3 - Listar todos os clientes");
                    System.out.println("4 - Atualizar cliente");
                    System.out.println("0 - Voltar");

                    int opcaoCliente = sc.nextInt();

                    switch (opcaoCliente) {
                        case 1:
                            System.out.println("Digite o ID do cliente que deseja buscar: ");
                            int idBuscarCliente = sc.nextInt();
                            clienteController.buscar(idBuscarCliente);
                            break;

                        case 2:
                            System.out.println("Qual dos clientes deseja remover (1 ou 2)?");
                            int escolhaRemoverCliente = sc.nextInt();
                            if (escolhaRemoverCliente == 1) {
                                clienteController.remover(cliente0);
                            } else if (escolhaRemoverCliente == 2) {
                                clienteController.remover(cliente1);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de todos os clientes:");
                            clienteController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID do cliente que deseja atualizar: ");
                            int idDoClienteAtualizar = sc.nextInt();
                            System.out.println("Digite o novo ID do cliente: ");
                            int novoIdCliente = sc.nextInt();
                            clienteController.atualizar(idDoClienteAtualizar, novoIdCliente);
                            break;

                        case 0:
                            System.out.println("Voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.println("Menu de Entrega:");
                    System.out.println("1 - Buscar entrega por ID");
                    System.out.println("2 - Remover entrega");
                    System.out.println("3 - Listar todas as entrega");
                    System.out.println("4 - Atualizar entrega");
                    System.out.println("0 - Voltar");

                    int opcaoEntrega = sc.nextInt();

                    switch (opcaoEntrega) {

                        case 1:
                            System.out.println("Digite o ID da entrega que deseja buscar: ");
                            int idBuscarEntrega = sc.nextInt();
                            entregaController.buscar(idBuscarEntrega);
                            break;

                        case 2:
                            System.out.println("Qual das entregas deseja remover (1 ou 2)?");
                            int escolhaRemoverEntrega = sc.nextInt();
                            if (escolhaRemoverEntrega == 1) {
                                entregaController.remover(entrega1);
                            } else if (escolhaRemoverEntrega == 2) {
                                entregaController.remover(entrega2);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de entregas: ");
                            entregaController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID da entrega que deseja atualizar: ");
                            int idAtualizarEntrega = sc.nextInt();
                            System.out.println("Digite o novo ID da entrega: ");
                            int novoIdEntrega = sc.nextInt();
                            entregaController.atualizar(idAtualizarEntrega, novoIdEntrega);
                            break;

                        case 0:
                            System.out.println("voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 3:

                    System.out.println("Menu do Entregador:");
                    System.out.println("1 - Buscar entregador por ID");
                    System.out.println("2 - Remover entregador");
                    System.out.println("3 - Listar todos os entregadores");
                    System.out.println("4 - Atualizar entregadores");
                    System.out.println("0 - Voltar");

                    int opcaoEntregador = sc.nextInt();

                    switch (opcaoEntregador) {

                        case 1:
                            System.out.println("Digite o ID do entregador que deseja buscar: ");
                            int idBuscarEntregador = sc.nextInt();
                            entregadorController.buscar(idBuscarEntregador);
                            break;

                        case 2:
                            System.out.println("Qual dos entregadores deseja remover (1 ou 2)?");
                            int escolhaRemoverEntregador = sc.nextInt();
                            if (escolhaRemoverEntregador == 1) {
                                entregadorController.remover(entregador1);
                            } else if (escolhaRemoverEntregador == 2) {
                                entregadorController.remover(entregador2);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de entregadores: ");
                            entregadorController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID do entregador que deseja atualizar: ");
                            int idAtualizarEntregador = sc.nextInt();
                            System.out.println("Digite o novo ID do entregador: ");
                            int novoIdEntregador = sc.nextInt();
                            entregadorController.atualizar(idAtualizarEntregador, novoIdEntregador);
                            break;

                        case 0:
                            System.out.println("voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 4:
                    System.out.println("Menu do Funcionario:");
                    System.out.println("1 - Buscar Funcionario por ID");
                    System.out.println("2 - Remover Funcionario");
                    System.out.println("3 - Listar todos os Funcionarios");
                    System.out.println("4 - Atualizar Funcionarios");
                    System.out.println("0 - Voltar");

                    int opcaoFuncionario = sc.nextInt();

                    switch (opcaoFuncionario) {

                        case 1:
                            System.out.println("Digite o ID do funcionário que deseja buscar: ");
                            int idBuscarFuncionario = sc.nextInt();
                            funcionarioController.buscar(idBuscarFuncionario);
                            break;

                        case 2:
                            System.out.println("Qual dos Funcionarios deseja remover (1 ou 2)?");
                            int escolhaRemoverFuncionario = sc.nextInt();
                            if (escolhaRemoverFuncionario == 1) {
                                funcionarioController.remover(funcionario1);
                            } else if (escolhaRemoverFuncionario == 2) {
                                funcionarioController.remover(funcionario2);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de funcionários: ");
                            funcionarioController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID do funcionário que deseja atualizar: ");
                            int idAtualizarFuncionario = sc.nextInt();
                            System.out.println("Digite o novo ID do funcionário: ");
                            int novoIdFuncionario = sc.nextInt();
                            funcionarioController.atualizar(idAtualizarFuncionario, novoIdFuncionario);
                            break;

                        case 0:
                            System.out.println("voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;


                case 5:
                    System.out.println("Menu do Pagamento: ");
                    System.out.println("1 - Buscar Pagamento por ID");
                    System.out.println("2 - Remover Pagamento");
                    System.out.println("3 - Listar todos os Pagamentos");
                    System.out.println("4 - Atualizar Pagamentos");
                    System.out.println("0 - Voltar");

                    int opcaoPagamento = sc.nextInt();

                    switch (opcaoPagamento) {

                        case 1:
                            System.out.println("Digite o ID do pagamento que deseja buscar: ");
                            int idBuscarPagamento = sc.nextInt();
                            pagamentoController.buscar(idBuscarPagamento);
                            break;

                        case 2:
                            System.out.println("Qual dos Pagamentos deseja remover (1 ou 2)?");
                            int escolhaRemoverPagamento = sc.nextInt();
                            if (escolhaRemoverPagamento == 1) {
                                pagamentoController.remover(pagamento);
                            } else if (escolhaRemoverPagamento == 2) {
                                pagamentoController.remover(pagamento2);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de pagamentos: ");
                            pagamentoController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID do pagamento que deseja atualizar: ");
                            int idAtualizarPagamento = sc.nextInt();
                            System.out.println("Digite o novo ID do pagamento: ");
                            int novoIdPagamento = sc.nextInt();
                            pagamentoController.atualizar(idAtualizarPagamento, novoIdPagamento);
                            break;
                        case 0:
                            System.out.println("voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 6:
                    System.out.println("Menu do Pedido: ");
                    System.out.println("1 - Buscar Pedido por ID");
                    System.out.println("2 - Remover Pedido");
                    System.out.println("3 - Listar todos os Pedidos");
                    System.out.println("4 - Atualizar Pedidos");
                    System.out.println("0 - Voltar");

                    int opcaoPedido = sc.nextInt();

                    switch (opcaoPedido) {

                        case 1:
                            System.out.println("Digite o ID do pedido que deseja buscar: ");
                            int idBuscarPedido = sc.nextInt();
                            sc.nextLine();
                            pedidoController.buscar(idBuscarPedido);
                            break;

                        case 2:
                            System.out.println("Qual dos Pedidos deseja remover (1 ou 2)?");
                            int escolhaRemoverPedido = sc.nextInt();
                            if (escolhaRemoverPedido == 1) {
                                pedidoController.remover(pedido1);
                            } else if (escolhaRemoverPedido == 2) {
                                pedidoController.remover(pedido02);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de pedidos: ");
                            pedidoController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID do pedido que deseja atualizar: ");
                            int idAtualizarPedido = sc.nextInt();
                            System.out.println("Digite o novo ID do pedido: ");
                            int novoIdPedido = sc.nextInt();
                            pedidoController.atualizar(idAtualizarPedido, novoIdPedido);
                            break;

                        case 0:
                            System.out.println("voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 7:
                    System.out.println("Menu da Avaliação:");
                    System.out.println("1 - Buscar Avaliação por ID");
                    System.out.println("2 - Remover Avaliação");
                    System.out.println("3 - Listar todas as Avaliações");
                    System.out.println("4 - Atualizar Avaliações");
                    System.out.println("0 - Voltar");

                    int opcaoAvaliacao = sc.nextInt();

                    switch (opcaoAvaliacao) {

                        case 1:
                            System.out.println("Digite o ID da Avaliação que deseja buscar: ");
                            int idBuscarAvaliacao = sc.nextInt();
                            sc.nextLine();
                            avaliacaoController.buscar(idBuscarAvaliacao);
                            break;

                        case 2:
                            System.out.println("Qual das Avaliações deseja remover (1 ou 2)?");
                            int escolhaRemoverAvaliacao = sc.nextInt();
                            if (escolhaRemoverAvaliacao == 1) {
                                avaliacaoController.remover(avaliacao1);
                            } else if (escolhaRemoverAvaliacao == 2) {
                                avaliacaoController.remover(avaliacao2);
                            } else {
                                System.out.println("Escolha inválida!");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de Avaliações: ");
                            avaliacaoController.listarTodos();
                            break;

                        case 4:
                            System.out.println("Digite o ID da avaliação que deseja atualizar: ");
                            int idAtualizarAvaliacao = sc.nextInt();
                            System.out.println("Digite o novo ID da Avaliação: ");
                            int novoIdAvaliacao = sc.nextInt();
                            pedidoController.atualizar(idAtualizarAvaliacao, novoIdAvaliacao);
                            break;

                        case 0:
                            System.out.println("voltando ao menu principal...");

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

}

