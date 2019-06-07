package br.com.ivan.orientacao.objetos.testes;

import br.com.ivan.orientacao.objetos.models.Conta;

public class TesteCriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(1500, 05025);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1500, 05026);
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
	}
}
