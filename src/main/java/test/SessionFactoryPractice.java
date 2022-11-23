package test;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository("sfr")
@Service
@Transactional
public class SessionFactoryPractice {
    private SessionFactory sessionFactory;
    private PersonRepo personRepo;

    @Autowired
    public SessionFactoryPractice(SessionFactory sessionFactory, PersonRepo personRepo) {
        this.sessionFactory = sessionFactory;
        this.personRepo = personRepo;
    }

    @Transactional(readOnly = true)
    public List<Person> allPerson(){
        return sessionFactory.getCurrentSession().createNamedQuery(Person.NAMED_QUERY, Person.class).list();
    }

    @Transactional
    public Person save(Person person){
        return personRepo.save(person);
    }

    @Transactional(readOnly = true)
    public List<Person> findAll(){
        return (List<Person>) personRepo.findAll();
    }
}
