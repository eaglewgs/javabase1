import java.util.Scanner;

/**
 * 抛出异常：throw 一般抛出某个你想抛出的异常（自定义的异常）
 * 用try catch处理异常需要注意的问题：
 * 1.catch块当中，一定要捕获相应的异常，如果程序抛出的异常在catch块当中，不能被捕获，
 * 那么就会交给jvm处理，就会停止下面的指令运行
 * 2.可以通过catch来捕获多个异常。
 * 3.不建议大家直接捕获Exception。
 * 4.finally块当中的代码终究会被执行。
 * 5.不建议在finally当中出现return 语句。
 * @author wgsstart
 * @creat 2021-03-08 17:13
 */
class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args)  {
        Person person = new Person();
        try {
            Person person2 = (Person)person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public static int divide(int x,int y) throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("y == 0");
        }
        return x/y;
    }
    public static int func1(){
        int[] array = {1,2,3};
        try{
            System.out.println(array[4]);
            return 1;
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");

            return 3;

        }finally {
            return 2;
        }
    }

    public static void main4(String[] args){
       try {
           System.out.println(divide(20, 0));
       }catch(ArithmeticException e){
           e.printStackTrace();
           System.out.println("hhhh");
       }
        System.out.println("继续执行");

    }

    public static void main3(String[] args) {
        try{
            func2();
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }
    public static void func2(){
        int[] arr = {1,2,3};
        System.out.println(arr[100]);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int n = scanner.nextInt();
            System.out.println(10 / n);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally{
            scanner.close();
        }
        //System.out.println(func1());
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3};
        try{
            System.out.println(array[1]);
            System.out.println("不会被执行！");
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }finally {
            System.out.println("finally块的代码肯定会被执行！"+"所以经常做一些善后工作，" +
                    "比如关闭资源");
        }
        System.out.println("hello");
    }
}
