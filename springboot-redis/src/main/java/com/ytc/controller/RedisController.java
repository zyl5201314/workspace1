/**
 * Copyright (C), 2019, 因特驰
 * FileName: RedisController
 * Author:   zyl
 * Date:     2021/3/6 15:56
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/6
 * @since 1.0.0
 */
@Controller
public class RedisController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("name","DOG"+new Date());
        System.out.println(ops.get("name"));

        BoundHashOperations<String, Object, Object> car = stringRedisTemplate.boundHashOps("car");
        car.put("carname","宝马");
        car.put("carprice","1000");
        System.out.println(car.get("car"));

        Map<Object, Object> entries = car.entries();
        Set<Map.Entry<Object, Object>> entries1 = entries.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entries1.iterator();
        while (iterator.hasNext()){
            Map.Entry<Object, Object> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }


        return "SUCCESS";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2(){

        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set("name","张三",10, TimeUnit.SECONDS);
        System.out.println(ops.get("name"));


        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("bookid",100);
        hashMap.put("bookname","朝花夕拾");
        hash.putAll("book",hashMap);

        Map<Object, Object> book = hash.entries("book");
        Set<Map.Entry<Object, Object>> entries = book.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Object, Object> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
//
//        BoundListOperations<String, Object> listmovie = redisTemplate.boundListOps("listmovie");
//        listmovie.leftPush();

        return "success";
    }
}
