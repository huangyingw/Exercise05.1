package customers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;

@Aspect
public class TraceAdvice1 {
	@After("execution(* customers.EmailSender.sendEmail(..))&& args(email, message)")
	public void tracemethodA(JoinPoint joinpoint, String email, String message) {
		System.out.println(email);
		System.out.println(joinpoint.getSignature().getName());
		System.out.println(message);
		// joinpoint.getTarget().getClass().getMethod("getOutgoingMailServer",
		// parameterTypes)
	}
}
