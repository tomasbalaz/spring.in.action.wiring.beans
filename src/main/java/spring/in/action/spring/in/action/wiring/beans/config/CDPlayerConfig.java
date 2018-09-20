package spring.in.action.spring.in.action.wiring.beans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.in.action.spring.in.action.wiring.beans.soundsystem.SgtPepperss;

@Configuration

//Works only when all classes are in same package
//@ComponentScan

//Works for specfied package
//@ComponentScan("spring.in.action.spring.in.action.wiring")

//Works for specfied package with basePackages
//@ComponentScan(basePackages= "spring.in.action.spring.in.action.wiring")

//Works for specfied packages with basePackages
//@ComponentScan(basePackages= {"spring.in.action.spring.in.action.wiring.beans", "spring.in.action.spring.in.action.wiring.soundsystem", "spring.in.action.spring.in.action.wiring.config"})

//Works for specfied class
//@ComponentScan(basePackageClasses= SgtPepperss.class)

//Works for specfied classes
@ComponentScan(basePackageClasses= {SgtPepperss.class})

public class CDPlayerConfig {

}
