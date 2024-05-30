package kr.ac.hnu.itup.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoffeeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CoffeeApplication.class, args);
        Cafe cafe = context.getBean("cafe", Cafe.class);
        Coffee aa = cafe.getOrder(5000, "아아");
        System.out.println(aa + "를 마신다.");
    }
}
