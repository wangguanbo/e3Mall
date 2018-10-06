package cn.e3mall.controller;

import cn.e3mall.pojo.TbItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/6 14:51
 */
@Controller
public class PageJumpController {


    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/{param}")
    public String toJsp(@PathVariable String param){
        return param;
    }

}
