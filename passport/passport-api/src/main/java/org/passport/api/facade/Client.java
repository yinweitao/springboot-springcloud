package org.passport.api.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by csdnyinwt on 2018/5/31.
 */
@FeignClient(name="passport-service")
public interface Client {

    @RequestMapping("/user/hello")
    String index(@RequestParam(value = "name") String name);
}
