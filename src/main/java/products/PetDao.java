package products;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class PetDao {
    public Pet findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(Pet.class, id);

    }

    public void save(Pet pet) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(pet);
        transaction.commit();
        session.close();
    }

    public void update(Pet pet) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(pet);
        transaction.commit();
        session.close();
    }

    public void delete(Pet pet) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(pet);
        transaction.commit();
        session.close();
    }

    public ArrayList<Pet> findAll() {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        return (ArrayList<Pet>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("from Pet ").list();

    }
}
