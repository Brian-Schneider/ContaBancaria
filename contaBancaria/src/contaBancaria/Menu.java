package contaBancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import contaBancaria.model.Conta;
import contaBancaria.model.ContaCorrente;
import contaBancaria.model.ContaPoupanca;
import contaBancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Cria o objeto Conta c1
		Conta c1 = new Conta(1, 123, 1, "Brian Schneider de Lima", 50000.0f);
		
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
		
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Vitória", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Kelvin", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
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
			System.out.println("||          4 - Atualizar Dados da Conta            ||");
			System.out.println("||          5 - Apagar Conta                        ||");
			System.out.println("||          6 - Sacar                               ||");
			System.out.println("||          7 - Depositar                           ||");
			System.out.println("||          8 - Transferir valores entre Contas     ||");
			System.out.println("||          9 - Sair                                ||");
			System.out.println("||                                                  ||");
			System.out.println("||--------------------------------------------------||");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if(opcao == 9) {
				System.out.println("\nBanco Bamerindus: Gente que faz!!!");
				leia.close();
				System.exit(0);
			}
		
			switch(opcao) {
			case 1:
				System.out.println("\nCriar Conta\n");
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todas as Contas\n");
				keyPress();
				break;
			case 3:
				System.out.println("\nBuscar Conta por Número\n");
				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar Dados da Conta\n");
				keyPress();
				break;
			case 5:
				System.out.println("\nApagar Conta\n");
				keyPress();
				break;
			case 6:
				System.out.println("\nSacar\n");
				keyPress();
				break;
			case 7:
				System.out.println("\nDepositar\n");
				keyPress();
				break;
			case 8:
				System.out.println("\nTransferir valores entre Contas\n");
				keyPress();	
				break;
			default:
				System.out.println("\nOperação inválida!\n");
				keyPress();
			
			}
		}

	}
	
	public static void keyPress() {
		
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente do Enter!");
		}
		
	}

}
