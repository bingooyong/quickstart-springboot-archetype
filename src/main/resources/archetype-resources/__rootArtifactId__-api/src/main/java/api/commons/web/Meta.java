package ${package}.api.commons.web;

import lombok.Data;

/**
 * @author LvYong
 * @create 2017-12-07
 **/
@Data
public class Meta {
    private int totalCount;
    private int totalPages;
    private int currentPage;
    private int pageSize;
    private int realSize;
    private int startIndex;
}
