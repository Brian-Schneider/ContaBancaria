package contaBancaria;

import java.util.Scanner;

import contaBancaria.model.Conta;
import contaBancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Cria o objeto Conta c1
		Conta c1 = new Conta(1, 123, 2, "Brian Schneider de Lima", 50000);
		
		//Visualiza os dados da conta
		c1.visualizar();
		
		//Atualiza o Saldo da Conta
		c1.setSaldo(60000.0f);
		
		//Visualiza apenas o Saldo da Conta
		System.out.println(c1.getSaldo());
		
		//Efetua um saque na conta
		if(c1.sacar(5000.0f));
			System.out.println("\n\n" + c1.getSaldo());
		
		//Efetua um depósito na Conta
		c1.depositar(20000.0f);
		
		//Visualiza os dados da conta
		c1.visualizar();
		
		int opcao;
		
		while(true) {
		
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "||--------------------------------------------------||");
			System.out.println("||                                                  ||");
			System.out.println("||                 Banco Bamerindus                 ||");
			System.out.println("||                                                  ||");
			System.out.println("||--------------------------------------------------||");
			System.out.println("||                                                  ||");
			System.out.println("||          1 - Criar Conta                         ||");
			System.out.println("||          2 - Listar todas as Contas              ||");
			System.out.println("||          3 - Buscar Conta por Número             ||");
			System.out.println("||          4 - Atalizar Dados da Conta             ||");
			System.out.println("||          5 - Apagar Conta                        ||");
			System.out.println("||          6 - Sacar                               ||");
			System.out.println("||          7 - Depositar                           ||");
			System.out.println("||          8 - Transferir valores entre Contas     ||");
			System.out.println("||          9 - Sair                                ||");
			System.out.println("||                                                  ||");
			System.out.println("||--------------------------------------------------||");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco Bamerindus: Gente que faz!!!");
				leia.close();
				System.exit(0);
			}
		
			switch(opcao) {
			case 1:
				System.out.println("\nCriar Conta\n");
				break;
			case 2:
				System.out.println("\nListar todas as Contas\n");
				break;
			case 3:
				System.out.println("\nBuscar Conta por Número\n");
				break;
			case 4:
				System.out.println("\nAtualizar Dados da Conta\n");
				break;
			case 5:
				System.out.println("\nApagar Conta\n");
				break;
			case 6:
				System.out.println("\nSacar\n");
				break;
			case 7:
				System.out.println("\nDepositar\n");
				break;
			case 8:
				System.out.println("\nTransferir valores entre Contas\n");
				break;
			default:
				System.out.println("\nOperação inválida!\n");
			
			}
		}

	}

}
