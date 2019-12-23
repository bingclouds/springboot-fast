package cn.tongdun.mybatis.mapper;

import cn.tongdun.mybatis.model.DimMilestoneGpsTmp;

public interface DimMilestoneGpsTmpMapper {
    int insert(DimMilestoneGpsTmp record);

    int insertSelective(DimMilestoneGpsTmp record);
}