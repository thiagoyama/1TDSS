package br.com.fiap.tds.view;

public class ExemploConversaoTipos {
	
	//Converter um tipo primitivo para outros tipos
	public static void main(String[] args) {
		
		//Conversão implicita (automatica) 
		// byte -> short -> int -> long -> float -> double
		byte valorByte = 20;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		valorFloat = valorShort;
		valorInt = valorByte;
		
		//Conversão explicita (cast -> forcar um tipo ser de outro tipo)
		valorFloat = (float) valorDouble;
		
		valorFloat = 10.45f; //f -> define que o valor é um float (d,l)
		
		valorInt = (int) valorFloat;
		
		System.out.println("Int: " + valorInt);
		
	}

}
