package com.jerry.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
切面类
 */
@Aspect
public class MyAspectAnno {

    @Before(value="execution(* com.jerry.aspectJ.demo1.ProductDao.save(..))")
    public void before(JoinPoint joinPoint){

        //通过传入一个JoinPoint对象，可以打印出具体的切点信息
        System.out.println("******前置通知*****" + joinPoint);
    }


    //通过returning属性，可以定义方法返回值，作为参数
    @AfterReturning(value = "execution(* com.jerry.aspectJ.demo1.ProductDao.update(..))",returning = "result")
    public void afterReturing(Object result){

        //通过传入一个JoinPoint对象，可以打印出具体的切点信息
        System.out.println("******后置通知*****" + result);
    }
}
