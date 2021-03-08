package operation;

import book.Book;
import book.BookList;

/**
 * @author wgsstart
 * @creat 2021-03-08 11:25
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for(int i = 0;i < bookList.getUsedSize();i++){
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
