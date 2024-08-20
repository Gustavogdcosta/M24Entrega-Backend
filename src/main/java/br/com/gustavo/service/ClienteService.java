package br.com.gustavo.service;

import br.com.gustavo.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
    
    public String Buscar() {
    	clienteDao.Buscar();
    	return "Este é o ClienteDao";
    }
    
    public String Excluir() {
    	clienteDao.Buscar();
    	return "Você está excluindo";
    }
    
    public String Atualizar() {
    	clienteDao.Atualizar();
    	return "Atualizando Cadastro";
    }
}
