package br.com.fnkgw.reflexao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.fnkgw.reflexao.NotaFiscal;
import br.com.fnkgw.reflexao.Usuario;
import br.com.fnkgw.reflexao.ValidadorNulo;

public class ValidadorNuloTest {

	@Test
	public void testUsuario() {
		Usuario u = new Usuario();
		u.ativo = true;
		u.email = "usuario@provedor.com";
		u.papel = "admin";
		u.login = "master";
		
		List<String> lista = ValidadorNulo.getAtributosNulos(u);
		assertEquals(1, lista.size());
		assertTrue(lista.contains("senha"));
	}

	@Test
	public void testNotaFiscal() {
		NotaFiscal nf = new NotaFiscal();
		nf.talao = 4;
		nf.sequencia = 3321;
		
		List<String> lista = ValidadorNulo.getAtributosNulos(nf);
		assertEquals(3, lista.size());
		assertTrue(lista.contains("cnpj"));
		assertTrue(lista.contains("data"));
		assertTrue(lista.contains("endereco"));
	}
}
