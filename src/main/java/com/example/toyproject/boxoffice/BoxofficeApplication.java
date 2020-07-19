package com.example.toyproject.boxoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// 초기 데이터설정 오류로 인해 exclude
public class BoxofficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoxofficeApplication.class, args);
    }

}
