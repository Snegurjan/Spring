package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook(String))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: popitka poluchit knigu");
    }

   /* @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: popitka vernut knigu v biblioteku");
    }*/
}