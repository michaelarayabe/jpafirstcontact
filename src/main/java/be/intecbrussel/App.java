package be.intecbrussel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        Alien a = new Alien();
        a.setId(9);
        a.setName("Maria");
        a.setTech("Hardware");

        Alien b = new Alien();
        b.setId(122);
        b.setTech("testing");

        Alien c = new Alien();


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        c = em.find(Alien.class,2);
        System.out.println(c);

        em.getTransaction().begin();
        em.persist(a);
        em.persist(b);
        em.getTransaction().commit();

        System.out.println(a);

    }
}
