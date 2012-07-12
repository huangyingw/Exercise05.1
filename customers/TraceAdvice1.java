package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TraceAdvice1 {
	@Before("execution(* module4.aop.order.AccountService.addAccount(..))")
	public void tracemethodA(JoinPoint joinpoint) {
		System.out.println("TraceAdvice1:tracemethodA");
	}

	@Before("execution(* module4.aop.order.AccountService.addAccount(..))")
	public void tracemethodB(JoinPoint joinpoint) {
		System.out.println("TraceAdvice1:tracemethodB");
	}
}
