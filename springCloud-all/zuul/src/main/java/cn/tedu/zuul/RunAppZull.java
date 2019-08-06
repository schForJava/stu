package cn.tedu.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy     //启动zull  api网关
public class RunAppZull {
    public static void main(String[] args) {
        SpringApplication.run(RunAppZull.class,args);
    }
}
