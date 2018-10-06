package cn.e3mall.service;

import cn.e3mall.PageDataModel;
import cn.e3mall.pojo.TbItem;

/**
 *
 * @author wangguanbo
 */

public interface ItemService {

    //根据商品id查询
    TbItem getItemById(long id);

    //查询所有商品列表
    PageDataModel getAllTbItemList(int page , int rows);

}
