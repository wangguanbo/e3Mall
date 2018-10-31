package cn.e3mall.controller;

import cn.e3mall.EasyUiTreeNodeModel;
import cn.e3mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 *      树形菜单控制层
 * @Author wangguanbo
 * @Date 2018/10/8 11:15
 */
@Controller
public class ItemCatcontroller {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUiTreeNodeModel> getItemCatList(@RequestParam(name = "id" , defaultValue = "0" ) Long parentId){
        return itemCatService.getCatList(parentId);
    }


}
