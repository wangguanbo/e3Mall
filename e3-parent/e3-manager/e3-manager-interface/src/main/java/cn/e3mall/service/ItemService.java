package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 *
 * @author wangguanbo
 */

public interface ItemService {

    //根据商品id查询
    TbItem getItemById(long id);

}
