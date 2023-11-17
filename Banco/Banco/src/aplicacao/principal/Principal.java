package aplicacao.principal;

import aplicacao.principal.servicos.Menu;
import aplicacao.principal.servicos.Servicos;
import aplicacao.principal.servicos.MoedaFormat;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Menu
        Menu menu = new Menu();
        //Serviços
        Servicos servicos = new Servicos();
        System.out.println("- 1° Deposite um valor para simular.\nValor: ");
        servicos.setDeposito(sc.nextDouble());
        //menu
        int opcao;
                do {
                    System.out.println(menu.getMenu());

                    while (!sc.hasNextInt()) {
                        System.out.println("Opção inválida! Por favor, digite um número.");
                        sc.next();
                    }
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Saldo: " + MoedaFormat.format(servicos.getSaldo()));
                            break;
                        case 2:
                            System.out.println("- Saque \nDigite o valor: ");
                            servicos.setSaque(sc.nextDouble());
                            break;
                        case 3:
                            System.out.println("- Deposito \nDigite o valor: ");
                            servicos.setDeposito(sc.nextDouble());
                            break;
                        case 4:
                            System.out.println("- Traferir \nDigite o valor: ");
                            servicos.setTransferir(sc.nextDouble());
                            break;
                        case 5:
                            System.out.println("Obrigado pela preferência.\nAcesso encerrado...");
                            break;
                        default:
                            System.out.println("Opção inválida! Escolha novamente.");
                            break;
                    }
                } while (opcao != 5);

        sc.close();
    }
}