package hiber.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hiber.model.User;

@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public List<User> listUsers() {
        String hql = "SELECT DISTINCT u FROM User u JOIN FETCH u.car";
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(hql, User.class);
        return query.getResultList();
    }

    @Override
    public User getUserByCarModelAndSeries(String model, int series) {
        String hql = "SELECT u FROM User u JOIN FETCH u.car c WHERE c.model = :model AND c.series = :series";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, User.class)
                .setParameter("model", model)
                .setParameter("series", series)
                .list().get(0); // or .getSingleResult(); but you get errors if db has same model+series cars
    }

}
