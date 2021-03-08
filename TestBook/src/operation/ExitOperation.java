package operation;

import book.BookList;

/**
 * @author wgsstart
 * @creat 2021-03-08 11:26
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
