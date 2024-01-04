package run.ice.lib.core.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import run.ice.lib.core.serialize.Serializer;

/**
 * 带有分页条件的查询参数
 *
 * @author DaoDao
 */
@Schema(title = "PageParam", description = "带有分页条件的查询")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParam<P> implements Serializer {

    /**
     * 当前页码
     * 起始页为 1
     */
    @Schema(title = "页码", description = "页码，>= 1 ，起始页 = 1", example = "1")
    @Min(value = 1)
    @Max(value = Integer.MAX_VALUE)
    private Integer page = 1;

    /**
     * 分页步长（每页数量）
     * > 0
     */
    @Schema(title = "步长", description = "分页步长，> 0", example = "10")
    @Min(value = 1)
    @Max(value = 1000)
    private Integer size = 10;

    @Schema(title = "参数", description = "查询")
    @Valid
    @NotNull
    private P param;

    public PageParam(P param) {
        this.param = param;
    }

}
