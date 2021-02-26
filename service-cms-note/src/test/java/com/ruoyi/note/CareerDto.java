package com.ruoyi.note;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-26 11:10
 */

@Data
public class CareerDto {
    private Long value;
    private String label;
    private Boolean is_recommended;
    private List<CareerDto> children;

}
