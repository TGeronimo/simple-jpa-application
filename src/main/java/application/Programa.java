package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa(4, "Carlos da Silva", "carlos@gmail.com");
//        Pessoa p2 = new Pessoa(5, "Joaquim Torres", "joaquim@gmail.com");
//        Pessoa p3 = new Pessoa(6, "Ana Maria", "anamaria@gmail.com");

//        a string passada deve ser igual à definida no persistence.xml
//        no transaction-type do persistence-unit
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();

//        Busca uma pessoa no BD
        Pessoa p = em.find(Pessoa.class, 4);

//        Remove uma pessoa da tabela
//        Sempre que for fazer uma alteração no banco é necessário
//        iniciar a transação e fazer o commit no término.
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println(p);
        System.out.println("Pronto");
        em.close();
        emf.close();


    }
}
