package be.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import be.com.fiap.entity.Bebida;

public class AtuallizacaoTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		EntityManager em = fabrica.createEntityManager();
		
		Bebida bebida = em.find(Bebida.class, 1);
		bebida.setNomeBebida("Pinga");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println(bebida.getNomeBebida());
		
		em.close();
		fabrica.close();
	}
}
