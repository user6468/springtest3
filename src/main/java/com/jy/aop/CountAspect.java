package com.jy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CountAspect {

    @AfterReturning(value = "execution(public int com.jy.utils.water.Count.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint, int result){
        if (result < 0){
            System.out.println("对不起，该饮料不够喝了，请重新去饮料机取一定数量的饮料！");
        } else {
            System.out.println("还剩"+ result+"毫升");
        }

    }

}
