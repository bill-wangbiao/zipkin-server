package com.bill.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: zipkin-server
 * @Package com.bill.server
 * @Description: 启动类
 * @date Date : 2021年05月20日 12:03
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
