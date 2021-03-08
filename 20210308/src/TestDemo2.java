/**
 * 自定义异常:
 *1. 一定要继承一个父类异常
 * @author wgsstart
 * @creat 2021-03-08 20:35
 */
class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
public class TestDemo2 {
    public static void func(int x) throws MyException{
        if(x == 10){
            throw new MyException("x ==10");
        }
    }
    public static void main(String[] args) {
       try {
           func(10);
       }catch (MyException e){
           e.printStackTrace();
       }
    }
}
