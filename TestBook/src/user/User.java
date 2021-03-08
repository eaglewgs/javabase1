package user;

import book.BookList;
import operation.IOperation;

/**
 * @author wgsstart
 * @creat 2021-03-08 11:37
 */
public abstract class User {
    protected String name;
    protected IOperation[] operations;

    public User(String name){
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList, int choice){
        this.operations[choice].work(bookList);
    }

}
