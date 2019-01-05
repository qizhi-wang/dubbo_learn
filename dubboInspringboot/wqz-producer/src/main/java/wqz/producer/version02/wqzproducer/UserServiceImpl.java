package wqz.producer.version02.wqzproducer;

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
@Service(version = "2.0")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public Address getAddress() {
        Address address = new Address();
        address.setAddress( "湖北省，武汉市，洪山区，山水年华G1,我是新版本！！" );
        return address;
}
}

