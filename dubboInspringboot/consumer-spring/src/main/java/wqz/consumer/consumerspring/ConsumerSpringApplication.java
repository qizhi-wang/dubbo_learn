package wqz.consumer.consumerspring;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@EnableDubboConfig
@SpringBootApplication
public class ConsumerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run( ConsumerSpringApplication.class, args );
    }

}

