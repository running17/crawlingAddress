package com.address.crawling.mapper;

import com.address.crawling.entity.City;
import com.address.crawling.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {

    void insert(@Param("list")List<City> cities);

    void deleteAll();

    List<City> selectAll();

    void deleteAllByProvinces(@Param("list")List<Province> errors);
}
