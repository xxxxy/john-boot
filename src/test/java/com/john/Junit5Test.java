package com.john;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@DisplayName("测试Junit5功能")
@SpringBootTest
public class Junit5Test {

    @DisplayName("测试DisplayName")
    @Test
    public void testDisplayName() {
        System.out.println("ce");
    }

    @Disabled
    @DisplayName("测试2")
    @Test
    public void test2() {
        System.out.println("ce");
    }

    /**
     * 规定方法的超时时间，超出时间，抛出异常
     */
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    @Test
    public void testTimeout() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("timeout");
    }

    @RepeatedTest(5)
    public void testRepeat() {
        System.out.println("1");
    }

    @Test
    @DisplayName("测试对象是否一样")
    public void testSame() {
        Object o1 = new Object();
        Object o2 = new Object();
        Assertions.assertSame(o1, o2, "对象不一样");
    }


    @Test
    @DisplayName("测试数组是否一样")
    public void testArray() {
        Assertions.assertArrayEquals(new int[]{1, 2}, new int[]{0, 1});
    }


    @Test
    @DisplayName("测试组合断言")
    public void testAll() {
        Assertions.assertAll("test", () -> Assertions.assertTrue(true && true, ""));
    }

    @Test
    @DisplayName("测试前置条件")
    public void test1(){
        Assumptions.assumeTrue(true,"满足前置条件");
        System.out.println("1111111111");
    }


    @BeforeEach
    public void testBeforeEach() {
        System.out.println("测试就要开始了。。。");
    }

    @AfterEach
    public void testAfterEash() {
        System.out.println("测试结束了。。。");
    }

    @BeforeAll
    public static void testBeforeAll() {
        System.out.println("所有测试就要开始了。。。");
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("所有测试已经结束了。。。");
    }
}
