package run.ice.lib.core.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author DaoDao
 */
@Getter
@AllArgsConstructor
public enum CoreError implements ErrorEnum {

    /**
     * OK
     */
    OK("000000", "OK"),

    /**
     * ERROR
     */
    ERROR("999999", "ERROR"),

    ;

    /**
     * 错误编码
     */
    public final String code;

    /**
     * 错误信息
     */
    public final String message;

}
