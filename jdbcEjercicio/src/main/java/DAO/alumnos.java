package DAO;

public class alumnos {

		private int id;
		private String nombre;
		private String apellidos;
		

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		
		
		
		//BUILDER
		public alumnos(int id, String nombre, String apellidos) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}

	
		public alumnos() {}	
		
}
