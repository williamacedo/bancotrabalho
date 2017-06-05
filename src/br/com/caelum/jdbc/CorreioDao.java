package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.modelo.Estados;

public class CorreioDao {
	private Connection connection;

	public CorreioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Estados estados) {
		String sql = "insert into estados (uf,nome) values (?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1, estados.getUf());
			stmt.setString(2, estados.getNome());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Estados estados) {
		String sql = "update estados set uf=?, nome=? where id=?";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, estados.getUf());
			stmt.setString(2, estados.getNome());
			stmt.setLong(3, estados.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Estados estados) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from estados where id=?");

			stmt.setLong(1, estados.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Estados> getLista() {
		try{
			List<Estados> estados = new ArrayList<Estados>();
			PreparedStatement stmt = this.connection.
					 prepareStatement("select * from estados");
					 ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				Estados estado = new Estados();
				estado.setId(rs.getLong("id"));
				estado.setUf(rs.getString("uf"));
				estado.setNome(rs.getString("nome"));
				estados.add(estado);
			}
		rs.close();
		stmt.close();
		return estados;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
