package me.kimyounghan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Autowired
    YounghanProperties younghanProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================================================");
        System.out.println(younghanProperties.getFullName());
        System.out.println(younghanProperties.getAge());
        System.out.println(younghanProperties.getSessionTimeout());
        System.out.println("==================================================");
    }
}
