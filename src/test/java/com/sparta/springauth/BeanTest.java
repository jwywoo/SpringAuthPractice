package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

@SpringBootTest
@Primary
public class BeanTest {
    // Getting same type of beans of one Interface for AutoWired 1
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;

    // Getting same type of beans of one Interface for AutoWired 2
    // Add @Primary Here and one more at the bean
    // @Autowired => indicates we are using Bean from IoC container
    // @Component => indicates we are setting current class as bean
    // @Autowired
    //Food food;

    // Getting same type of beans of one Interface for AutoWired 3
    // @Qualifier > @Primary
    // @Primary -> Is good for universal class or bean
    // @Qualifier -> Is good for non-universal class or bean
    // Narrow => Higher Priority
    // Broad => Lower priority
    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Test 1")
    void test1() {
        food.eat();
    }

}
