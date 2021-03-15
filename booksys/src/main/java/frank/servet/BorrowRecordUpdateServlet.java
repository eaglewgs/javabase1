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
@WebServlet("/borrowRecord/update")
public class BorrowRecordUpdateServlet extends AbstractBaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        BorrowRecord record = JSONUtil.read(req.getInputStream(),BorrowRecord.class);
        int num = BorrowRecordDAO.update(record);
        if(num != 1)
            throw new BusinessException("00009","修改图书借阅信息数量异常");
        return null;
    }
}
