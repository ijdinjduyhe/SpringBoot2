package com.annie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


public class SecurityApplicationTests {

    @Test
    public void contextLoads() {

        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        String str = bc.encode("123");
        System.out.println(str);
    }

}

