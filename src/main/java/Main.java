import com.sai.training.springprimer.configuration.AppConfiguration;
import com.sai.training.springprimer.services.calculator.CalculatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by saipkri on 02/03/16.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        CalculatorService calculatorService = context.getBean(CalculatorService.class);
        Object result = calculatorService.evaluate("(1+2)*3");
        System.out.println(result);
    }
}
