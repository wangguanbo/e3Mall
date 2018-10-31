package cn.e3mall.service.impl;

import cn.e3mall.EasyUiTreeNodeModel;
import cn.e3mall.mapper.TbItemCatMapper;
import cn.e3mall.pojo.TbItemCat;
import cn.e3mall.pojo.TbItemCatExample;
import cn.e3mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author wangguanbo
 * @Date 2018/10/8 11:04
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUiTreeNodeModel> getCatList(long parentId) {

        EasyUiTreeNodeModel easyUiTreeNodeModel;
        List<EasyUiTreeNodeModel> resultList = new ArrayList<>(20);

        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);

        for (TbItemCat tbItemCat : tbItemCatMapper.selectByExample(tbItemCatExample)) {
            easyUiTreeNodeModel = new EasyUiTreeNodeModel();
            easyUiTreeNodeModel.setId(tbItemCat.getId());
            easyUiTreeNodeModel.setText(tbItemCat.getName());
            easyUiTreeNodeModel.setState(tbItemCat.getIsParent()?"close":"open");
            resultList.add(easyUiTreeNodeModel);
        }
        return resultList;
    }


}
