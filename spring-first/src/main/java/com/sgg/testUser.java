package com.sgg;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GT
 * @date 2023/3/3
 * @apiNote
 */


public class testUser {
    @Test
    public void testSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }
}
