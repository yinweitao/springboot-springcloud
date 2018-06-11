package org.passport.api.example;

import org.passport.api.facade.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csdnyinwt on 2018/5/30.
 */

@RestController
@RequestMapping("/FeiConsumer")
public class FeiConsumerController {

    @Autowired
    Client client;

    @RequestMapping("/autowired")
    public void getEureka() {
        System.out.println("开始 autowrite方法");
        String a = client.index("ddddd");
        System.out.println(a);
    }

}
