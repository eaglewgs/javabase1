package frank.servet;

import frank.dao.BorrowRecordDAO;
import frank.exception.BusinessException;
import frank.model.BorrowRecord;
import frank.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wgsstart
 * @creat 2021-03-14 20:51
 */
@WebServlet("/borrowRecord/delete")
public class BorrowRecordDeleteServlet extends AbstractBaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
       String[] ids =  req.getParameterValues("ids");//ids=4&ids=5...
        int num = BorrowRecordDAO.delete(ids);
        if(num != ids.length)
            throw new BusinessException("00009","删除图书借阅信息数量异常");
        return null;
    }
}
