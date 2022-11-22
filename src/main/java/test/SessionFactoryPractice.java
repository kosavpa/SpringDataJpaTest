package test;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository("sfr")
@Transactional
public class SessionFactoryPractice {
    private SessionFactory sessionFactory;

    @Autowired
    public SessionFactoryPractice(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Person> allPerson(){
        return sessionFactory.getCurrentSession().createNamedQuery(Person.NAMED_QUERY, Person.class).list();
    }
}
