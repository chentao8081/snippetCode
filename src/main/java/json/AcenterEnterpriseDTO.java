package json;

import lombok.Data;

import java.util.List;

/**
 * @author chentao
 * @date 2017/12/12
 **/
@Data
public class AcenterEnterpriseDTO {
    private String id;

    private String name;

    private List<AcenterEnterpriseMetaDTO> enterpriseMetas;
}
