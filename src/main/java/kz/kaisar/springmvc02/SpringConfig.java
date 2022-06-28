package kz.kaisar.springmvc02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.kaisar.springmvc02")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
