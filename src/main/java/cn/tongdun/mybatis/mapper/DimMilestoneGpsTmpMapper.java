package cn.tongdun.mybatis.mapper;

import cn.tongdun.mybatis.model.DimMilestoneGpsTmp;

import java.util.List;

public interface DimMilestoneGpsTmpMapper {

    List<DimMilestoneGpsTmp> queryInfos(DimMilestoneGpsTmp dimMilestoneGpsTmp);

    int insert(DimMilestoneGpsTmp record);

    int insertSelective(DimMilestoneGpsTmp record);

}