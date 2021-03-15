package frank.exception;

/**
 * @author wgsstart
 * @creat 2021-03-13 15:18
 */
//客户端异常
public class BusinessException extends BaseException {
    public BusinessException(String code, String message) {
        super("BUS"+code,"业务异常： "+ message);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super("BUS"+code,"业务异常： " +message, cause);
    }
}
