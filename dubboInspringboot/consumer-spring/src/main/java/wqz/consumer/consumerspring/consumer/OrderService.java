package wqz.consumer.consumerspring.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wqz.service.UserService;

/**
 * 
 * @Author: qizhi.wang
 * @Email: qizhi.wang@rograndec.com
 * @CreateDate: 2019/1/5
 * @Version: 1.0
 */
@Controller
public class OrderService {
    @Reference(check = false,version = "2.0")
    UserService userService;
    @RequestMapping("/getAddress")
    @ResponseBody
    public String getAddress(){
        return userService.getAddress().getAddress();
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "I am a test method!";
    }
}

