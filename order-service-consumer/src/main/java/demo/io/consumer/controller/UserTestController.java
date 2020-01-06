package demo.io.consumer.controller;

import demo.io.api.domain.UserAddress;
import demo.io.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserTestController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<UserAddress> getUserAddress(@RequestParam String userId) {
        return orderService.initOrder(userId);
    }

}
