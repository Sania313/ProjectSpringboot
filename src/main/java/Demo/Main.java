package Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

      //  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
     //  Doctor doc = context.getBean(Doctor.class);
     /*   doc.assist();
         Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();*/
       // Staff staff = context.getBean(AnnotationDoctor.class);
        //staff.assist();
       // Staff staff1 = context.getBean(Nurse.class);
        //staff1.assist();
       // System.out.println(doc.getQualification());
       // AnnotationDoctor annotationDoctor = context.getBean(AnnotationDoctor.class);
        //annotationDoctor.assist();
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanCofigJava.class);
      Doctor doctor = context.getBean(Doctor.class);
      doctor.assist();
      doctor.setQualification("MBBS");
                System.out.println(doctor);
    }
}