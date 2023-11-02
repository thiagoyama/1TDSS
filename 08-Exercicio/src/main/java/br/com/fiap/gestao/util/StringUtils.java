package br.com.fiap.gestao.util;

public class StringUtils {

	//metodo para validar se uma string eh nula ou vazia 
	public static boolean isNullOrEmpty(String valor) {
		return (valor == null || valor.isEmpty());
	}
	
	//validar se a string possui mais do que x caracteres
	public static boolean hasMoreThan(String valor, int caracteres) {
		return valor.length() > caracteres;
	}
	
	public static boolean isNullOrEmptyOrHasMoreThan(String valor, int caracateres) {
		return isNullOrEmpty(valor) || hasMoreThan(valor, caracateres);
	}
	
	public static boolean has(String valor, int caracteres) {
		return valor.length() == caracteres;
	}
	
}