package cn.e3mall;

import java.io.Serializable;
import java.util.List;

/**
 * @Description
 *     page分页所用Model
 * @Author wangguanbo
 * @Date 2018/10/6 15:10
 */
public class PageDataModel implements Serializable {

    private Long total;

    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
