package run.ice.lib.core.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import run.ice.lib.core.serialize.Serializer;

import java.util.List;

/**
 * 带有分页信息的数据响应
 *
 * @author DaoDao
 */
@Schema(title = "PageData", description = "带有分页信息的数据响应")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageData<D> implements Serializer {

    /**
     * 当前页码
     * 起始页为 1
     */
    @Schema(title = "页码", description = "页码，>= 1 ，起始页 = 1", example = "1")
    private Integer page;

    /**
     * 分页步长（每页数量）
     * > 0
     */
    @Schema(title = "步长", description = "分页步长，> 0", example = "10")
    private Integer size;

    /**
     * 总条数
     */
    @Schema(title = "总数", description = "所有分页的总条数", example = "100")
    private Long total;

    /**
     * 数据列表
     */
    @Schema(title = "列表", description = "数据列表")
    private List<D> list;

}
