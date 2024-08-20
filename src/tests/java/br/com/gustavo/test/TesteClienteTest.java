package br.com.gustavo.test;


import org.junit.Assert;
import org.junit.Test;

import br.com.gustavo.TesteCliente;

public class TesteClienteTest {

	
	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Gustavo");
		cli.adicionarNome1("Gustavo");

		Assert.assertEquals("Gustavo", cli.getNome());
	}
}
