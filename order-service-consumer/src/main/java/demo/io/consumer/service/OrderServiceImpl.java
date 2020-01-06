package demo.io.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import demo.io.api.domain.UserAddress;
import demo.io.api.service.OrderService;
import demo.io.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
