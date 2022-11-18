package DAO;

import java.sql.SQLException;
import java.sql.Connection;
import javax.sql.DataSource;




public class alumnosImplement implements alumnosService {
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void insertar(alumnos alu) {
		
		try {
			Connection SQLConect = dataSource.getConnection();
			
			SQLConect.createStatement().executeUpdate("INSERT INTO \"EjemploInicial\".alumnos (id, nombre, apellidos, email) VALUES ('"+ alu.getId() +"', '"+ alu.getNombre() +"', '"+ alu.getApellidos() +"');");
			SQLConect.close();
			System.out.println("Cierre conexión, declaración y resultado");
				
				

			} catch (SQLException e) {

				
				e.printStackTrace();
				System.out.println("Error: " + e);
		
		
			}
	}
}

