package demo.io.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import demo.io.api.domain.UserAddress;
import demo.io.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        //模拟获取数据过程，这里为简化，自定义两个地址对象返回
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座9层", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1, address2);
    }
}
