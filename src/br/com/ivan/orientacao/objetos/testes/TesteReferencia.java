package br.com.ivan.orientacao.objetos.testes;

import br.com.ivan.orientacao.objetos.models.Conta;

public class TesteReferencia {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(1500, 05027);
		primeiraConta.deposita(300);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1500, 05025);
		
		segundaConta = primeiraConta;
		
		System.out.println(segundaConta.getSaldo());
		
		segundaConta.deposita(segundaConta.getSaldo() + 100);
		System.out.println(segundaConta.getSaldo());

	}

}
