package com.address.crawling.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author running
 * 街道/城镇
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Town extends BaseEntity {

    /**
     * 区县编码
     */
    private String countyCode;

    /**
     * 下级地址
     */
    private String path;

}
