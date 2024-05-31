package Demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(Demo..*)")
    public void authenticationPointcut()
    {

    }
    @Pointcut("within(Demo..*)")
    public void authorizationPointCut()
    {

    }
    @Before("authenticationPointcut() && authorizationPointCut()")
    public void authentication(){
        System.out.println("Authenticating Request");
    }
}
