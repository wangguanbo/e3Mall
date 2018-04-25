package cn.e3mall.service.impl;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理
 * @author
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long id) {

        //直接通过ID查找
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);

        //还可以通过条件查找
        /*
        TbItemExample tbItemExample = new TbItemExample();
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        return null == tbItems && tbItems.size() > 0 ? null : tbItems.get(0);
        */

      return tbItem;
    }
}
