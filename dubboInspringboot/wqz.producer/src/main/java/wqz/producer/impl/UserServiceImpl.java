package wqz.producer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import wqz.service.UserService;
import wqz.service.bean.Address;

/**
 * 
 * @Author: qizhi.wang
 * @Email: qizhi.wang@rograndec.com
 * @CreateDate: 2019/1/5
 * @Version: 1.0
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public Address getAddress() {
        Address address = new Address();
        address.setAddress( "湖北省，武汉市，洪山区，山水年华G1" );
        return address;
    }
}

