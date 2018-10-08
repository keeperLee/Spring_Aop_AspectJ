package com.jerry.aspectJ.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
切面类
 */
@Aspect
public class MyAspectAnno {

    @Before(value="execution(* com.jerry.aspectJ.demo1.ProductDao.save(..))")
    public void before(){
        System.out.println("******前置通知*****");
    }
}
