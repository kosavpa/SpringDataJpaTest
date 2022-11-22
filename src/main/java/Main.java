import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.Person;
import test.PersonRepo;
import test.SessionFactoryPractice;
import test.SpringJPA_Config;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJPA_Config.class);

        for(Person person : context.getBean("sfr", SessionFactoryPractice.class).allPerson()){
            System.out.println(person);
        }
    }
}
