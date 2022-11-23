import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.Person;
import test.SessionFactoryPractice;
import test.SpringJPA_Config;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJPA_Config.class);

        SessionFactoryPractice sfp = context.getBean("sfr", SessionFactoryPractice.class);

        for(Person person : sfp.allPerson()){
            System.out.println(person);
        }

        System.out.println("----new person:\n\t" + sfp.save(new Person("Dilan",
                                                                "Brcking Bog",
                                                                "Aristarhovich",
                                                                "dbba@mail.ru",
                                                                789)));

        sfp.findAll().stream().forEach(System.out::println);
    }
}
