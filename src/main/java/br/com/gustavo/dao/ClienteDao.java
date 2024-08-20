package br.com.gustavo.dao;

public class ClienteDao implements IClienteDao {
	
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }
    
    public String Buscar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
	}

	@Override
	public String Excluir() {
		// TODO Auto-generated method stub
        throw new UnsupportedOperationException("Não funciona sem config de banco");
	}

	@Override
	public String Atualizar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
	}

}
