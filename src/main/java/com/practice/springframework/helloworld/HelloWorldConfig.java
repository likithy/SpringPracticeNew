package com.practice.springframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record introduced in jdk 16 no need to create getters and setters
record Person(String name, int age, Address address) {}
;

record Address(String street, String country) {}
;

// define methods to define spring beans
@Configuration
public class HelloWorldConfig {
  // here we can define spring beans
  // things managed by spring are called spring beans
  @Bean
  public String name() {
    return "Likith";
  }

  @Bean
  public int age() {
    return 12;
  }

  @Bean
  public Person person() {
    return new Person("Likith", 20, new Address("Hyd", "IND"));
  }

  @Bean
  public Person person2MethodCall() {
    return new Person(name(), age(), address());
  }

  @Bean
  public Person person3Parameters(String name, int age, Address address) {
    return new Person(name, age, address);
  }
  @Bean
  public Person person4Parameters(String name, int age,  @Qualifier("address3qualifier") Address address) {
    return new Person(name, age, address);
  }
  @Bean(name = "Custom Bean Name")
  @Primary
  public Address address() {
    return new Address("Baker Street", "London");
  }

  @Bean(name = "address2")
  @Qualifier("address3qualifier")
  public Address address2() {
    return new Address("Baker Street 2", "London 2");
  }
}
