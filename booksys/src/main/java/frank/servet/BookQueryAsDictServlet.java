package frank.servet;

import frank.dao.BookDAO;
import frank.model.Book;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author wgsstart
 * @creat 2021-03-14 15:00
 */
@WebServlet("/book/queryAsDict")
public class BookQueryAsDictServlet  extends AbstractBaseServlet{

    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Book> books = BookDAO.queryAsDict();
        return books;
    }
}
