package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author wgsstart
 * @creat 2021-03-08 11:24
 */
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字： ");
        String name = scanner.nextLine();
        int i = 0;
        for(; i < bookList.getUsedSize(); i++){
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("没有这本书！");
            return;
        }
        //删除--》逻辑和顺序表一样
        int pos = i;
        for(;pos < bookList.getUsedSize()-1;pos++){
          Book book = bookList.getBook(pos+1);
          bookList.setBooks(pos,book);
          //
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功！");
    }
}
