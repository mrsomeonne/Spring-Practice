package com.example.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired  // Field injection
    @Qualifier("employee")
    private Employee employee;

//    @Autowired   //Injecting this Dependency using Constructor Injection
//    public Manager(Employee employee) {
//        this.employee = employee;
//
//        // Spring will take a look of what this particular class needs,
//        // So it needs employee. Then it will automatically inject the bean of type Employee
//
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
