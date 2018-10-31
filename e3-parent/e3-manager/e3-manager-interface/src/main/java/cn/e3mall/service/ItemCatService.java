package cn.e3mall.service;

import cn.e3mall.EasyUiTreeNodeModel;

import java.util.List;


public interface ItemCatService {

    /**
     * 树形列表查询层级结构service
     * @param parentId
     * @return
     */
    List<EasyUiTreeNodeModel> getCatList(long parentId);

}
