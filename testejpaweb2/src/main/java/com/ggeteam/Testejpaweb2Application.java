package com.ggeteam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ggeteam.domain.Pizza;

@SpringBootApplication
public class Testejpaweb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Testejpaweb2Application.class, args);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pizzas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pizza pizzaAdicionar = new Pizza();
		Pizza pizzaRemover = entityManager.find(Pizza.class, 5);
		Pizza pizzaAtualizar = entityManager.find(Pizza.class, 4);

		pizzaAdicionar.setSabor("4 Queijos");
		pizzaAdicionar.setPreco(35);
		pizzaAdicionar.setTamanho('G');

//		entityManager.getTransaction().begin();
//		entityManager.persist(pizzaAdicionar);
//		System.out.println("Pizza com sabor " + pizzaAdicionar.getSabor() + " adicionada.");
//		entityManager.remove(pizzaRemover);
		System.out.println("Pizza com sabor " + pizzaRemover.getSabor() + " removida.");
//		pizzaAtualizar.setSabor("Peperoni");
		System.out.println("Pizza atualizada para o sabor " + pizzaAtualizar.getSabor() + ".");
//		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}

}
