package br.com.gustavo.service;

import br.com.gustavo.dao.IContratoDao;

public class ContratoService implements IContratoService {
	
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

	@Override
	public String Buscar() {
		// TODO Auto-generated method stub
        contratoDao.Buscar();
        return "Este é o ContratoDao";
	}

	@Override
	public String Excluir() {
		// TODO Auto-generated method stub
        contratoDao.Excluir();
        return "Excluido com sucesso";
	}

	@Override
	public String Atualizar() {
		// TODO Auto-generated method stub
        contratoDao.Atualizar();
        return "Contrato Atualizado";
	}

}
