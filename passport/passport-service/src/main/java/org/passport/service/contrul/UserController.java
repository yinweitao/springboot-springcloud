package org.passport.service.contrul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/hello",produces="application/json;charset=utf-8")
    public String index(@RequestParam(value = "name") String name)
    {
        System.out.println("FeignClient 调用成功");
        return "成功";
    }


    @RequestMapping(value="/selectByName",produces="application/json;charset=utf-8")
    public String  selectByName()
    {
        System.out.println("username=dafdsaf");
        return "成功";
    }



    
}
