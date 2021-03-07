/**
 * Copyright (C), 2019, 因特驰
 * FileName: RedisTest
 * Author:   zyl
 * Date:     2021/1/19 17:34
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/1/19
 * @since 1.0.0
 */
@RestController
public class RedisTest {
  /* @Autowired
    StringRedisTemplate redisTemplate;*/
  /*  @Test
   public void test1(){
           ValueOperations<String, String> str = redisTemplate.opsForValue();
           str.set("name","Dog"+new Date().toLocaleString());
           String name = str.get("name");
           System.out.println(name);
       }*/
     @Autowired
    RedisTemplate<String,String> redisTemplate;

     @RequestMapping("test1")
     public void test1(){
         ValueOperations<String, String> str = redisTemplate.opsForValue();
         str.set("name","Dog"+new Date().toLocaleString());
         String name = str.get("name");
         System.out.println(name);
     }


}
