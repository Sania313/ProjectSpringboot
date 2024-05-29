package Demo;


import org.springframework.stereotype.Component;

@Component
public class AnnotationDoctor implements Staff{
    public void assist()
    {
        System.out.println("This is Annotation Doctor Assist fucntion");
    }
}
