package wqz.producer.version02.wqzproducer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class WqzProducerApplicationVersion02 {

    public static void main(String[] args) {
        SpringApplication.run( WqzProducerApplicationVersion02.class, args );
    }

}

