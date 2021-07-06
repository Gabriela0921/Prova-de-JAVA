package Conta;

public class Conta {
	String datadeA;
	String nomedoTi;
	String agencia;
	int numerodac;
	double saldo;

	
	
	
	public Conta(String nome, String age, int numero, int saldo, String data){
		this.nomedoTi = nome;
		this.agencia = age;
		this.numerodac = numero;
		this.saldo = saldo;
		this.datadeA = data;
	}
	public String NomedoTi(){
		return nomedoTi = nomedoTi;
	}
	public int Numero() {
		return numerodac = numerodac;
	}
	public String Agencia() {
		return agencia = agencia;
	}
	 void sacar() {
		 System.out.println("O valor está sendo sacado.");
	}
	 public double Saldo(){
			return saldo = saldo;
	}
	 void depositar() {
		 System.out.println("foi depositado.");
			
	 }
	 void rendimento() {
		 System.out.println("O valor do rendimento foi R$0.50");
	 }
}