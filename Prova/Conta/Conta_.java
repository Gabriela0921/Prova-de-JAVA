package Conta;

import java.util.Scanner;

public class Conta_ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int operacao;
		int valor;
		
		Conta c1 = new Conta("Gabriela", "40028", 9222, 1200, "04/06");
		
		System.out.println("Olá, "+ c1.NomedoTi() + " o saldo da conta " + c1.Numero() + " e agencia " + c1.Agencia() + " é de " + c1.Saldo());
		System.out.println("Que operação vc deseja realizar: 1-Sacar 2-Depositar 3-Ver rendimento");
   	 	operacao=in.nextInt();
   	 	
   	 	if(operacao == 1) {
   	 		System.out.println("Qual é o valor do saque: ");
   	 		valor=in.nextInt();
   	 	if(valor <= c1.Saldo()) {
   	 	 c1.sacar();
   	 	} else{
   	 		System.out.println("Saldo indisponiver");}
   	 	 } else if (operacao == 2) {
   	 		System.out.println("Qual o valor de deposito: ");
   	 		valor=in.nextInt();
   	 			c1.depositar();
   	 	 } else if (operacao == 3)
   	 	 c1.rendimento();
   	 	}

	}

