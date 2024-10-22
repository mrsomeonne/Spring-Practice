package com.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.componentscan.annotation")
public class AppConfig {  //Configuration Class

    // Now we do not need A XML file

}
