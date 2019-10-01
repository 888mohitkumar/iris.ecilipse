package com.iris.CircularDependcy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Module4.xml");
    	ClientTest bean = applicationContext.getBean(ClientTest.class);
    	bean.temp.show();
    	System.out.println(applicationContext);
    	
    	/*        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module3.xml");
        Hello hello = (Hello) context.getBean("helloBean1");
        hello.printHello();
        
        Hello hello2 = (Hello) context.getBean("helloBean2");
        hello2.printHello();*/
        
        //new ClassPathXmlApplicationContext("Spring-Module.xml");
        //Student hello2 = (Student) context.getBean("student4");
        //hello2.details();        
        
  /*      A aa=(A)context.getBean("a");
        aa.helloA();
        
        

        B bb=(B)context.getBean("b");
        bb.helloB();*/
        
/*        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("com.iris.CircularDependcy");
        annotationConfigApplicationContext.refresh();
        Hello bean = annotationConfigApplicationContext.getBean(Hello.class);
        bean.printHello();*/
        
    }
}
