package br.com.ivan.orientacao.objetos.testes;

import br.com.ivan.orientacao.objetos.models.Conta;

public class TesteReferencia {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		
		segundaConta = primeiraConta;
		
		System.out.println(segundaConta.getSaldo());
		
		segundaConta.deposita(segundaConta.getSaldo() + 100);
		System.out.println(segundaConta.getSaldo());

	}

}
