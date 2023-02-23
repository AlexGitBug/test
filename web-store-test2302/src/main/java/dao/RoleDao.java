package dao;

import entity.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RoleDao implements Dao<Integer, Role>{

    @Override
    public List<Role> findAll() {
        try (var sessionFactory = HibernateUtil.buildSessionFactory();
             var session = sessionFactory.openSession()) {
            session.getTransaction();



            session.getTransaction().commit();
        }
    }

    @Override
    public Optional<Role> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Role update(Role entity) {
        return null;
    }

    @Override
    public Role save(Role entity) {
        return null;
    }
}
