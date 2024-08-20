package br.com.gustavo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.gustavo.dao.ClienteDaoMock;
import br.com.gustavo.dao.IClienteDao;
import br.com.gustavo.service.ClienteService;
import br.com.gustavo.dao.ClienteDao;

public class ClienteServiceTest {

	
	@Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
	
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao =  new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void BuscarTest() {
    	 IClienteDao mockDao = new ClienteDaoMock();
         ClienteService service = new ClienteService(mockDao);
         String retorno = service.Buscar();
         Assert.assertEquals("Este é o ClienteDao", retorno);    	
    }
    
    @Test
    public void ExcluirTest() {
    	 IClienteDao mockDao = new ClienteDaoMock();
         ClienteService service = new ClienteService(mockDao);
         String retorno = service.Excluir();
         Assert.assertEquals("Você está excluindo", retorno);    	
    }

    
    @Test
    public void AtualizarTest() {
    	 IClienteDao mockDao = new ClienteDaoMock();
         ClienteService service = new ClienteService(mockDao);
         String retorno = service.Atualizar();
         Assert.assertEquals("Atualizando Cadastro", retorno);    	
    }
}
