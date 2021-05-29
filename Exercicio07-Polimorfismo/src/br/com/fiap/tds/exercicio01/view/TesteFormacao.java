package br.com.fiap.tds.exercicio01.view;

import java.util.Scanner;

import br.com.fiap.tds.exercicio01.bean.Bacharelado;
import br.com.fiap.tds.exercicio01.bean.Medio;
import br.com.fiap.tds.exercicio01.bean.Tecnologo;

public class TesteFormacao {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Pedir o tipo de objeto que será criado
		System.out.println("Escolha a opção: \n1-Medio \n2-Tecnologo \n3-Bacharelado");
		int op = leitor.nextInt();
		
		//Ler os dados da formação (descrição e período)
		System.out.println("Digite a descrição");
		String descricao = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o período (1-Manha, 2-Tarde, 3-Noite)");
		int periodo = leitor.nextInt();

		//Chamar os métodos definirDuracao() e calcularMensalidade()
		//Exibir os dados do objeto
		switch (op) {
			case 1: {
				System.out.println("Digite o tipo");
				String tipo = leitor.next() + leitor.nextLine();
				Medio medio = new Medio(descricao, periodo, tipo);
				medio.definirDuracao();
				medio.calcularMensalidade(1);
				System.out.println(medio);
				break;
			}
			case 2 :{
				System.out.println("É plano estendido?");
				boolean plano = leitor.nextBoolean();
				Tecnologo tecnologo = new Tecnologo(descricao, periodo, plano);
				tecnologo.definirDuracao();
				tecnologo.calcularMensalidade(1);
				System.out.println(tecnologo);
				break;
			}
			case 3 :{
				System.out.println("Digite o TCC");
				String tcc = leitor.next() + leitor.nextLine();
				System.out.println("Digite a carga horária do estágio");
				int carga = leitor.nextInt();
				Bacharelado bacharel = new Bacharelado(null, periodo, tcc, carga);
				bacharel.definirDuracao();
				bacharel.calcularMensalidade(1);
				System.out.println(bacharel);
				break;
			}
			default:
				System.out.println("Opção inválida");
		}
		
		leitor.close();
	}
}
