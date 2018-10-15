package com.util;

import com.lesson2.OrderDAO;
import com.lesson2.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
