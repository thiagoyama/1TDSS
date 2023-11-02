package br.com.fiap.gestao.teste;

import java.time.LocalDate;

import br.com.fiap.gestao.model.Usuario;
import br.com.fiap.gestao.service.UsuarioService;

public class CadastroUsuarioTest {
	
	public static void main(String[] args) {
		try {
			//Criar uma instancia do service
			UsuarioService service = new UsuarioService();
			
			//Criar uma instancia do usuario
			Usuario usuario = new Usuario("lklsdf", "ronald9@fiap.com.br", "9849984", LocalDate.of(2000, 1, 20));
			
			//Cadastrar o usuario
			service.cadastrar(usuario);
			
			//Imprimir o codigo gerado pela sequence
			System.out.println(usuario.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
