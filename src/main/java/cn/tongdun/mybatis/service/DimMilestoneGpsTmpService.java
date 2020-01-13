package cn.tongdun.mybatis.service;

import cn.tongdun.mybatis.model.DimMilestoneGpsTmp;

import java.util.List;

public interface DimMilestoneGpsTmpService {

    List<DimMilestoneGpsTmp> queryInfos(DimMilestoneGpsTmp dimMilestoneGpsTmp);

    int batchInsert(DimMilestoneGpsTmp dimMilestoneGpsTmp);
}
