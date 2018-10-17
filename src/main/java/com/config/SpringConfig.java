package com.config;

import com.lesson2.OrderDAO;
import com.lesson2.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class SpringConfig {

    @Bean
    public OrderService orderService() {
        return new OrderService();
    }

    @Bean
    public OrderDAO orderDAO() {
        return new OrderDAO();
    }
}
