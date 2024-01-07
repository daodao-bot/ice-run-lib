package run.ice.lib.core.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import run.ice.lib.core.error.AppError;
import run.ice.lib.core.error.AppException;
import run.ice.lib.core.error.ErrorEnum;
import run.ice.lib.core.serialize.Serializer;

/**
 * @author DaoDao
 */
@Schema(title = "Response", description = "响应", accessMode = Schema.AccessMode.READ_ONLY)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<D> implements Serializer {

    /**
     * `000000` 表示成功，其他表示异常
     */
    @Schema(title = "code", description = "响应编码，6 位数字字符串", example = "000000", accessMode = Schema.AccessMode.READ_ONLY)
    @NotEmpty
    @Size(min = 6, max = 6)
    @Pattern(regexp = "^[0-9]{6}$")
    private String code = AppError.OK.code;

    /**
     * 如果发生异常，通常会展示具体的异常提示
     */
    @Schema(title = "message", description = "响应信息，字符串", example = "成功", accessMode = Schema.AccessMode.READ_ONLY)
    @NotEmpty
    @Size(min = 1, max = 255)
    private String message = AppError.OK.message;

    /**
     * 通常为复杂的数据对象
     * - 明文为数据对象的 json 格式
     * - 密文则为对象的 json 序列化的字符串的加密字符串
     * - 如果对象为空（不需要返回具体的数据内容），请传递空对象
     * - 空对象的序列化后的字符串明文为 `{}` ，密文则为这个字符串的加密字符串
     */
    @Schema(title = "data", description = "响应数据", accessMode = Schema.AccessMode.READ_ONLY)
    private D data;

    public Response(@NotNull D data) {
        this.data = data;
    }

    public Response(@NotEmpty String code, @NotEmpty String message) {
        this.code = code;
        this.message = message;
    }

    public Response(AppException exception) {
        this.code = exception.getCode();
        this.message = exception.getMessage();
    }

    public Response(ErrorEnum errorEnum) {
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
    }

    public static Response<Ok> ok() {
        Ok ok = new Ok();
        return new Response<>(ok);
    }

}
