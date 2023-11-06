package com.example.mvc.dao;

import com.example.mvc.entity.Affair;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AffairRepositoryImpl implements AffairRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Affair> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Affair> affairs = session.createQuery("select afr from Affair afr", Affair.class).getResultList();
        return affairs;
    }

    @Transactional
    public void save(Affair affair) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(affair);
    }

    @Transactional
    public Affair findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Affair.class, id);
    }

    @Transactional
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Affair affair = findById(id);
        session.delete(affair);
    }

}
