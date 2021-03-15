package frank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wgsstart
 * @creat 2021-03-15 13:22
 */
@Getter
@Setter
@ToString
public class Page {
    private String searchText;
    private String sortOrder;
    private Integer pageSize;
    private Integer pageNumber;
}
