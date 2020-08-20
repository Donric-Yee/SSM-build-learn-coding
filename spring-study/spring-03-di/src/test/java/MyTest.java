import com.donric.pojo.Prople;
import com.donric.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());
    }

    @Test
   public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("peoplebeans.xml");
        Prople people = context.getBean("people", Prople.class);
        people.getCat().shout();
        people.getDog().shout();
    }





}

