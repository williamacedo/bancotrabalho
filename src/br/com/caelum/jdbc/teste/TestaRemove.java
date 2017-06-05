package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.CorreioDao;
import br.com.caelum.jdbc.modelo.Estados;

public class TestaRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estados estados = new Estados();
		estados.setId(28);
		
		CorreioDao bd = new CorreioDao();
		
		bd.remove(estados);
		
		System.out.println("Removido!");
	}

}
