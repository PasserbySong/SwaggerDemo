package com.example.demo.controller;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/5/19.
 */
@Controller
@Api(value = "测试Controller", description = "测试微服务")
@RequestMapping(value = "/controller")
public class Test2Controller {


    @ApiOperation(value = "这是一个测试接口，你可以传参")
    @RequestMapping(value = "/hello/{parm1}/{parm2}",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "parm1", required = true, value = "参数1", defaultValue = "Parm1"),
            @ApiImplicitParam(paramType = "path", name = "parm2", required = true, value = "参数2", defaultValue = "Parm2")
    })
    @ResponseBody
    String hello(@PathVariable String parm1,@PathVariable String parm2) {
        return "Hello:"+parm1+"&&"+parm2;
    }

    @ApiOperation(value = "这是一个测试接口2，你可以传参")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    String hello2(@ApiParam(name = "parm1", required = true, value = "参数1", defaultValue = "Parm1")
                  @RequestParam String parm1,
                  @ApiParam(name = "parm2", required = true, value = "参数2", defaultValue = "Parm2")
                  @RequestParam String parm2) {
        return "Hello:"+parm1+"&&"+parm2;
    }

    @ApiOperation(value = "这是一个测试接口3，你可以传参")
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    @ResponseBody
    User hello3(@RequestBody User user) {
        return user;
    }


}
