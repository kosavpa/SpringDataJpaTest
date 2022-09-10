package test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repo")
public interface PersonRepo extends CrudRepository<Person, Long> {
}
