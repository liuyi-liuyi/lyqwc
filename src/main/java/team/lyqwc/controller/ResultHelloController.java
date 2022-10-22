package team.lyqwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.lyqwc.moudle.pojo.ResultReturn;


@Controller
public class ResultHelloController {

    //映射路径,整个应用中必须保证唯一性,否则会抛出异常
    @ResponseBody // 将这个方法的返回结果转换成json字符串
    @GetMapping("test")
    public ResultReturn hello(){
        return new ResultReturn("200","测试");
    }
}
