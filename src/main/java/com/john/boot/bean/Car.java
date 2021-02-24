package com.john.boot.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 方式1：@Component + @ConfigurationProperties
 * 方式2：@ConfigurationProperties + @EnableConfigurationProperties
 */
@Data
@ToString
@EqualsAndHashCode
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;

    private Integer price;

}
