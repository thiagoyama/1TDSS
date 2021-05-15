package br.com.fiap.tds.ltp.jogo.personagem.orc;

import br.com.fiap.tds.ltp.jogo.personagem.Personagem;

//CTRL + SHIFT + o
public class Orc extends Personagem {

	//CTRL + 3 -> gcfs (Gera os construtores iguais ao da superclasse)
	//Construtores
	public Orc() {}

	public Orc(int forca, int inteligencia, int destreza, int level, String nome) {
		super(forca, inteligencia, destreza, level, nome);
	}
	
}
