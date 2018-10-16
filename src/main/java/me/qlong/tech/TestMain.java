/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package me.qlong.tech;

/**
 * @author qilong.zql
 */
public class TestMain {
    public static void main(String[] args) {
        Flux.just("Hello world!")
                .map(it -> it.split(""))
                .flatMap(Flux::fromArray)
                .zipWith(Flux.range(1, 100), (str,count) -> count + str)
                .subscribe(System.out::println);
    }
}