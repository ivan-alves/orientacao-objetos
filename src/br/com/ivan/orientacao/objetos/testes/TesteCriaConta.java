package br.com.ivan.orientacao.objetos.testes;

import br.com.ivan.orientacao.objetos.models.Conta;

public class TesteCriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
	}
}
