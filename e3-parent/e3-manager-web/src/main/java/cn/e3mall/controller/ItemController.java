package cn.e3mall.controller;

import cn.e3mall.PageDataModel;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemCatService;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author 商品管理controller
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getTbItemById(@PathVariable("itemId")  long itemId){
        return itemService.getItemById(itemId);
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public PageDataModel tbItemListForJson(@RequestParam("page") int page , @RequestParam("rows") int rows){
        PageDataModel allTbItemList = itemService.getAllTbItemList(page, rows);
        return allTbItemList;
    }

}
