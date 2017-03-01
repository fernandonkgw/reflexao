package br.com.fnkgw.reflexao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.fnkgw.reflexao.BuscaStringEmAtributo;
import br.com.fnkgw.reflexao.Usuario;

public class BuscaStringEmAtributoTest {

	@Test
	public void testUsuario() {
		Usuario usuario = new Usuario();
		usuario.email = "usuario@provedor.com";
		usuario.login = "master";
		
		List<String> lista = BuscaStringEmAtributo.getAtributosComString(usuario, "master");
		assertEquals(1, lista.size());
		assertTrue(lista.contains("login"));
	}

}
