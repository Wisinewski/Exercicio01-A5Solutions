package br.com.a5.model.DAO;

import br.com.a5.bean.PessoaBean;

public interface PessoaDao {

	public boolean insert(PessoaBean pessoaBean);
	public boolean findByCpf(PessoaBean pessoaBean);
	
}
