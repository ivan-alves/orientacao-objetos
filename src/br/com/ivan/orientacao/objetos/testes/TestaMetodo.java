package br.com.ivan.orientacao.objetos.testes;

import br.com.ivan.orientacao.objetos.models.Conta;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		conta1.deposita(50);
		System.out.println(conta1.getSaldo());
		
		conta1.saca(20);
		System.out.println(conta1.getSaldo());
	}

}
