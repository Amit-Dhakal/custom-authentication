package com.example.CustomDBAuthentication;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Demo {

    public static void main(String[] args) {

        PasswordEncoder pe=new BCryptPasswordEncoder();

        System.out.println(pe.encode("123"));
    }

}
