package com.l.diy;

import com.l.service.UserService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//通过注解实现 AOP
@Aspect //标注这个类是个切面
public class AnnotationPointCut {
    @Pointcut("execution(* com.l.service.UserServiceImpl.*(..))")
    public void pointcut() {
    }
//    前置通知
    //    @Before("execution(* com.l.service.UserServiceImpl.*(..))")
    @Before("pointcut()")
    public void before() {
        System.out.println("========before========");
    }
//    最终通知
    @After("pointcut()")
    public void after() {
        System.out.println("========after========");
    }
//    环绕通知
    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        获得实例
        UserService userService = (UserService) joinPoint.getTarget();
        userService.update();
//        获得签名
        System.out.println(joinPoint.getSignature());
        System.out.println("执行前" + joinPoint);
//        执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("执行后" + joinPoint.getSignature().getName());
    }

//    后置通知
    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("==============AfterReturning==============");
    }
}
