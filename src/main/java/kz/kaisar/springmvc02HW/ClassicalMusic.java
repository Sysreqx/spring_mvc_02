package kz.kaisar.springmvc02HW;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Classical music #1";
    }
}
