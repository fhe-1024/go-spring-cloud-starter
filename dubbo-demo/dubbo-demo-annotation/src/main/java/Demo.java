import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContex = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContex.refresh();
    }
}
