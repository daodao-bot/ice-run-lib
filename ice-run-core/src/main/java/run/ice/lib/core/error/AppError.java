package run.ice.lib.core.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author DaoDao
 */
@Getter
@AllArgsConstructor
public enum AppError implements ErrorEnum {

    /**
     * OK
     */
    OK("000000", "OK"),

    TOKEN_ERROR("111111", "token 错误"),

    PARAM_ERROR("222222", "参数错误"),

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
