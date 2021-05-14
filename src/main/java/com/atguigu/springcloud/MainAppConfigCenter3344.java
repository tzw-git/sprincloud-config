package com.atguigu.springcloud;/**
 * @Author: TanZW
 * @DateTime: 2021/5/12 15:19
 * @Description: TODO
 * 项目描述: 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *@program: cloud2020
 *@description:
 *@author: ZiWei.Tan
 *@create: 2021-05-12 15:19
 */
@SpringBootApplication
@EnableConfigServer
public class MainAppConfigCenter3344 {

  public static void main(String[] args) {
    SpringApplication.run(MainAppConfigCenter3344.class,args);
  }
}