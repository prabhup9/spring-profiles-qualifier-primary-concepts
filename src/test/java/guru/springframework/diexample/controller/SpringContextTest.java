package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringContextTest {

    @Autowired
    DiController controller;

    @Test
    public void test(){
        System.out.println(controller.getGreeting());
    }
}

