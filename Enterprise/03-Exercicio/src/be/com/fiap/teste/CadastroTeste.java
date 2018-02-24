package be.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import be.com.fiap.entity.Bebida;
import be.com.fiap.entity.TipoBebida;

public class CadastroTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = fabrica.createEntityManager();
		
		Bebida bebida = new Bebida(TipoBebida.DESTILADO, "Vodka", Calendar.getInstance(), null, true);
		
		em.persist(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		
		em.close();
		fabrica.close();
	}

}
