package Demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* Demo.shoppingCart.Checkout())")
    public void Beforelogging(JoinPoint jp){
      //  System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
     System.out.println(arg);
    }

    @After("execution(* Demo.shoppingCart.Checkout())")
    public void afterLogger(){
        System.out.println("After logger");
    }
}
