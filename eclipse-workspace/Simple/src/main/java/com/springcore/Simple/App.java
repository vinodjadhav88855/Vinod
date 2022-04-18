package com.springcore.Simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Simple/config.xml");
       
       Hey h=(Hey) context.getBean("s1");
       System.out.println(h);
       context.registerShutdownHook();
       
    }
}
