package DAO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
				ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
				
				BeanFactory bean = appContext;
				
				alumnosImplement insercion = (alumnosImplement)bean.getBean("inserta");
				System.out.println("Inyección realizada");

				alumnos alIntroduccion0 = new alumnos (1, "Pablo", "Lopez");
				alumnos alIntroduccion1 = new alumnos (2, "Jesus", "Patricio");
				alumnos alIntroduccion2 = new alumnos (1, "Javi", "Mena");
				insercion.insertar(alIntroduccion0);
				insercion.insertar(alIntroduccion1);
				insercion.insertar(alIntroduccion2);
				
				//CIERRE APP CONTEXT: TEST
				((ClassPathXmlApplicationContext) appContext).close();
	}

}
