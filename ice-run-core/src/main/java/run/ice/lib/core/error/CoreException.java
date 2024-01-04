package run.ice.lib.core.error;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author DaoDao
 */
@Slf4j
@Setter
@Getter
public class CoreException extends RuntimeException {

    private String code;

    public CoreException() {
        super();
        this.code = CoreError.ERROR.code;
    }

    public CoreException(String message) {
        super(message);
        this.code = CoreError.ERROR.code;
    }

    public CoreException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CoreException(Exception exception) {
        super(exception);
        this.code = CoreError.ERROR.code;
    }

    public CoreException(String message, Exception exception) {
        super(message, exception);
        this.code = CoreError.ERROR.code;
    }

    public CoreException(String code, String message, Exception exception) {
        super(message, exception);
        this.code = code;
    }

    public <E extends Enum<E> & ErrorEnum> CoreException(E e) {
        super(e.getMessage());
        this.code = e.getCode();
    }

    public <E extends Enum<E> & ErrorEnum> CoreException(E e, String message) {
        super(e.getMessage() + " : " + message);
        this.code = e.getCode();
    }

    public <E extends Enum<E> & ErrorEnum> CoreException(E e, Exception exception) {
        super(e.getMessage(), exception);
        this.code = e.getCode();
    }

    public <E extends Enum<E> & ErrorEnum> CoreException(E e, String message, Exception exception) {
        super(e.getMessage() + " : " + message, exception);
        this.code = e.getCode();
    }

}
