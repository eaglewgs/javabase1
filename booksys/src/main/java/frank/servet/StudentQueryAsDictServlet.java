package frank.servet;

import frank.dao.StudentDAO;
import frank.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author wgsstart
 * @creat 2021-03-14 15:40
 */
@WebServlet("/student/queryAsDict")
public class StudentQueryAsDictServlet extends AbstractBaseServlet {

    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        int id = Integer.parseInt(req.getParameter("dictionaryKey"));
        List<Student> students = StudentDAO.queryDict(id);
        return students;
    }
}
