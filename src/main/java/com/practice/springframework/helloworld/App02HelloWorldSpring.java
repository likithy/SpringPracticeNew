package com.practice.springframework.helloworld;

import com.practice.springframework.helloworld.Address;
import com.practice.springframework.helloworld.HelloWorldConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
  public static void main(String[] args) {
    // Launch a spring context
    try (var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
      // config things we want spring to manage - @Configuration
      // Helloworld config
      // name-@Beamn
      // @Bean By name
      System.out.println(context.getBean("name"));
      System.out.println(context.getBean("age"));
      System.out.println(context.getBean("person"));
      // @Bean by custom name
      System.out.println(context.getBean("Custom Bean Name"));
      // @Bean by method call
      System.out.println(context.getBean("person2MethodCall"));
      // @Bean by param
      System.out.println(context.getBean("person3Parameters"));
      System.out.println(context.getBean("person4Parameters"));
      // @Bean by class
      System.out.println(context.getBean(Address.class));
      // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
  }
}
