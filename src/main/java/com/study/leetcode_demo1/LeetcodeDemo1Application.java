package com.study.leetcode_demo1;

import com.study.leetcode_demo1.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeDemo1Application.class, args);
        System.out.println("hello world");
        User user = new User();
        user.setName("zhangsan");
        String name = user.getName();
        System.out.println(name);
    }
}
