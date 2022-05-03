package com.yang.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDutils {

    // 获得随机id
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(getId());
    }
}
