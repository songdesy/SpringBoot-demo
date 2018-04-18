package com.example.web;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by LiWeilong on 2018/3/22.
 */

@RequestMapping("/hello")
@Controller
public class HelloWorldController {

    @ApiOperation(value="首页",notes="跳转到首页")
    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
