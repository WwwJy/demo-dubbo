package demo.io.api.service;

import demo.io.api.domain.UserAddress;

import java.util.List;

public interface UserService {
    //按照用户id返回所有的收货地址
    List<UserAddress> getUserAddressList(String userId);
}
