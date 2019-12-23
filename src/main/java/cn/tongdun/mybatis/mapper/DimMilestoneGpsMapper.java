package cn.tongdun.mybatis.mapper;

import cn.tongdun.mybatis.model.DimMilestoneGps;

public interface DimMilestoneGpsMapper {
    int insert(DimMilestoneGps record);

    int insertSelective(DimMilestoneGps record);
}