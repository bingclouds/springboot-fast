package cn.tongdun.mybatis.service.impl;

import cn.tongdun.mybatis.mapper.DimMilestoneGpsTmpMapper;
import cn.tongdun.mybatis.model.DimMilestoneGpsTmp;
import cn.tongdun.mybatis.service.DimMilestoneGpsTmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DimMilestoneGpsTmpImpl implements DimMilestoneGpsTmpService {

    @Autowired
    DimMilestoneGpsTmpMapper dimMilestoneGpsTmpMapper;

    @Override
    public List<DimMilestoneGpsTmp> queryInfos(DimMilestoneGpsTmp dimMilestoneGpsTmp) {

        List<DimMilestoneGpsTmp> dimMilestoneGpsTmps = dimMilestoneGpsTmpMapper.queryInfos(dimMilestoneGpsTmp);
        return dimMilestoneGpsTmps;

    }
}
