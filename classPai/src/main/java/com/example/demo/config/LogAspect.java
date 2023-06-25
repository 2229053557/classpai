package com.example.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LogAspect {

    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 定义切面
     */
    @Pointcut("execution(* com.example.demo.service.impl.*.*(..))")
    public void controllerLog() {
    }

    @Before(value = "controllerLog()")
    public void doBeforeController(JoinPoint joinPoint) {
//        String name = joinPoint.getSignature().getName();
//        System.out.println(name);
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
        String format = sdf.format(new Date());
        String ip = request.getRemoteAddr();
        String url = request.getRequestURI();
        String methodType = request.getMethod();

        //打印日志
        logger.debug("-----------------------------------------------------------------------------------------------------");
        logger.debug("时间 = {}", format);
        logger.debug("访问url = {}", url);
        logger.debug("请求方法类型 = {}", methodType);
        logger.debug("来源ip地址 = {}", ip);
        logger.debug("调用方法 = {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.debug("-----------------------------------------------------------------------------------------------------");
    }

    @Around(value = "controllerLog()")
    public Object doAfterController(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long end = System.currentTimeMillis();
        long time = end - start;
        logger.debug("执行时间 = {}", time + "ms");
        logger.info("执行时间 = {}", time + "ms");
        return object;
    }
}
