 package com.virtualadrian.config;


 import org.apache.commons.lang3.time.StopWatch;
 import org.aspectj.lang.ProceedingJoinPoint;
 import org.aspectj.lang.annotation.AfterThrowing;
 import org.aspectj.lang.annotation.Around;
 import org.aspectj.lang.annotation.Aspect;

 import org.springframework.stereotype.Component;

 @Aspect
 @Component
 public class AopServiceMonitor {

     private static final String LOG_MESSAGE_FORMAT = "%s.%s execution time: %dms";


     @AfterThrowing (pointcut = "execution(* com.virtualadrian..*.*(..))", throwing = "ex")
     public void afterThrow(Exception ex) throws Throwable {
         System.out.println("****LoggingAspect.logAfterThrowingAllMethods() " + ex);
     }

     @Around(("execution(* com.virtualadrian..*Service.*(..))"))
     public Object logTimeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
         StopWatch stopWatch = new StopWatch();
         stopWatch.start();

         Object retVal = joinPoint.proceed();

         stopWatch.stop();

         logExecutionTime(joinPoint, stopWatch);
         return retVal;
     }

     private void logExecutionTime(ProceedingJoinPoint joinPoint, StopWatch stopWatch) {
         String logMessage = String.format(LOG_MESSAGE_FORMAT, joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName(), stopWatch.getTime());
         System.out.println(logMessage);
     }
 }
