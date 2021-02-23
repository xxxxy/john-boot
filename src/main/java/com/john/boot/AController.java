package com.john.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类不在主程序目录及子目录下的测试
 */
@RestController
public class AController {
    @RequestMapping("/get")
    private String get() {
        return "hello";
    }
}
