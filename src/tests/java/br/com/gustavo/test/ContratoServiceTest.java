package br.com.gustavo.test;


import org.junit.Assert;
import org.junit.Test;

import br.com.gustavo.dao.ContratoDao;
import br.com.gustavo.dao.IContratoDao;
import br.com.gustavo.dao.mock.ContratoDaoMock;
import br.com.gustavo.service.ContratoService;
import br.com.gustavo.service.IContratoService;

public class ContratoServiceTest {
	
    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void BuscarTestContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.Buscar();
        Assert.assertEquals("Este é o ContratoDao", retorno);
    }
    
    @Test
    public void ExcluirTestContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.Excluir();
        Assert.assertEquals("Excluido com sucesso", retorno);
    }
    
    @Test
    public void AlterarTestContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.Atualizar();
        Assert.assertEquals("Contrato Atualizado", retorno);
    }

}
