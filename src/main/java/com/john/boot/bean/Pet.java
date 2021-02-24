package com.john.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "pet")
@Component
@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}
