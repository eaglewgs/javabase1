package frank.servet;

import frank.dao.BorrowRecordDAO;
import frank.model.BorrowRecord;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wgsstart
 * @creat 2021-03-14 16:14
 */
@WebServlet("/borrowRecord/queryById")
public class BorrowRecordQueryByidServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
      //获取图书借阅记录的id
       int id = Integer.parseInt(req.getParameter("id"));
        BorrowRecord record = BorrowRecordDAO.queryById(id);
        return record;
    }
}
