import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.Person;
import test.PersonRepo;
import test.SpringJPA_Config;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJPA_Config.class);

        PersonRepo repo = (PersonRepo) context.getBean("personRepo");
        Person spange = new Person("spange", "bob", "sqaowich", "sbs@list.ru", 654);
        repo.save(spange);
    }
}
