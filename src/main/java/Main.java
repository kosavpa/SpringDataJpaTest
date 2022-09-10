import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.Person;
import test.PersonRepo;
import test.SpringJPA_Config;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJPA_Config.class);

        for(String names : context.getBeanDefinitionNames()){
            System.out.println(names);
        }

        PersonRepo repo = (PersonRepo) context.getBean("repo");
        Person sponge = new Person("Skuidvard", "Oktopopus", "Stounhenjovich", "rockFace@mail.ru", 654);
        repo.save(sponge);
    }
}
