package com.ebartmedia.ejobss;

import com.ebartmedia.ejobss.service.JoinQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.ebartmedia.ejobss","com.ebartmedia.ejobss.service"})
public class EjobssApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjobssApplication.class, args);
    }

    @Bean
    public JoinQuery joinQuery() {
        return new JoinQuery();
    }
}
