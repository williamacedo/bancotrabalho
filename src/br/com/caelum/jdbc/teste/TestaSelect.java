package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.CorreioDao;
import br.com.caelum.jdbc.modelo.Estados;

public class TestaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CorreioDao dao = new CorreioDao();
		List<Estados> estados = dao.getLista();
		
		for (Estados estado : estados) {
			System.out.println("Uf: " + estado.getUf());
			System.out.println("Nome: " + estado.getNome());
			}
	}

}
