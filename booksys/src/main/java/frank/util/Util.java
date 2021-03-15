package frank.util;

import frank.model.Page;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wgsstart
 * @creat 2021-03-15 13:38
 */
public class Util {
    //解析搜索和分页的数据：
    public static Page parse(HttpServletRequest req){
        Page p = new Page();
        p.setSearchText(req.getParameter("searchText"));
        p.setSortOrder(req.getParameter("sortOrder"));
        p.setPageSize(Integer.parseInt(req.getParameter("pageSize")));
        p.setPageNumber(Integer.parseInt(req.getParameter("pageNumber")));
        return p;
    }
}
