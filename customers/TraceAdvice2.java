package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TraceAdvice2 {
	@Before("execution(* module4.aop.order.AccountService.addAccount(..))")
	public void tracemethodA(JoinPoint joinpoint) {
		System.out.println("TraceAdvice2:tracemethodA");
	}

	@Before("execution(* module4.aop.order.AccountService.addAccount(..))")
	public void tracemethodB(JoinPoint joinpoint) {
		System.out.println("TraceAdvice2:tracemethodB");
	}
}
