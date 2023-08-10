package br.com.fiap.collections.view;

import java.util.ArrayList;

public class ExemploLista {

	public static void main(String[] args) {
		
		//Criar uma lista de plantas
		ArrayList<String> lista = new ArrayList<>();
		
		//Adicionar algumas plantas
		lista.add("Rosa"); // 0
		lista.add("Orelha de Gato"); //1
		lista.add("Costela de Adão"); //2
		lista.add("Girasol"); //3
		
		//Adicionar um valor repetido
		lista.add("Girasol"); //4
		
		//Adiciona o elemento em uma determinada posição
		lista.add(1, "Rabo de macaco");
		
		//Substituir o elemento da posição 4
		lista.set(4, "Pata de Elefante");
		
		//Remover a Rosa
		lista.remove("Rosa");
		
		//Remover o elemento da posição 2
		lista.remove(2);
		//[0] Rabo de Macaco, [1] Orelha, [2] Pata, [3] Girasol 
		
		//Recuperar e exibir o elemento da posição 2
		String planta = lista.get(2);
		System.out.println(planta);
		
		//Remover todos os elementos da lista
		//lista.clear();
		
		//Verificar se existe a planta "Orelha de Gato" na lista
		if (lista.contains("Orelha de Gato")) {
			System.out.println("A lista tem Orelha de Gato");
		}
		
		//Verifica se a lista está vazia
		if (lista.isEmpty()) {
			System.out.println("Lista está vazia");
		}
		
		//Exibir a quantidade de plantas na lista
		System.out.println("Plantas: " + lista.size());
		
		//Exibir todos as plantas
		for (String item : lista) {
			System.out.println(item);
		}
	}
}