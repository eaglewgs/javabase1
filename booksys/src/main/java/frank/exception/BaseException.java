package frank.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wgsstart
 * @creat 2021-03-13 15:12
 */
@Getter
@Setter
public class BaseException  extends RuntimeException {
    protected String code;

    public BaseException( String code,String message) {
        super(message);
        this.code = code;
    }

    public BaseException(String code,String message, Throwable cause ) {
        super(message, cause);
        this.code = code;
    }
}
