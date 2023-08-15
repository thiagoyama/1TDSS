package br.com.fiap.collections.view;

import java.util.HashSet;

public class ExemploConjunto {

	public static void main(String[] args) {
		
		//Criar um cojunto de Cores
		HashSet<String> conjunto = new HashSet<String>();
		
		//Adicionar 4 cores no conjunto
		conjunto.add("Branco");
		conjunto.add("Azul");
		conjunto.add("Roxo");
		conjunto.add("Vermelho");
		
		//Adicionar um valor repetido
		conjunto.add("Roxo"); //foi ignorado
		
		//Exibir a quantidade de elementos no conjunto
		System.out.println(conjunto.size());
		
		//Exibir as cores do conjunto
		for (String item : conjunto) {
			System.out.println(item);
		}
		
	}
}