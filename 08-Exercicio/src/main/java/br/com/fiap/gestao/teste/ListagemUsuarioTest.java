package br.com.fiap.gestao.teste;

import java.util.List;

import br.com.fiap.gestao.model.Usuario;
import br.com.fiap.gestao.service.UsuarioService;

public class ListagemUsuarioTest {
	public static void main(String[] args) {
		try {
			// Criar uma instancia do service
			UsuarioService service = new UsuarioService();

			List<Usuario> lista = service.listar();
			
			for (Usuario user : lista) {
				System.out.println(user.getNome());
				System.out.println(user.getDataNascimento());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
