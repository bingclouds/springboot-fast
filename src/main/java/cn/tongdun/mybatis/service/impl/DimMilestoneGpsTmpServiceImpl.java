package cn.tongdun.mybatis.service.impl;

import cn.tongdun.mybatis.mapper.DimMilestoneGpsMapper;
import cn.tongdun.mybatis.mapper.DimMilestoneGpsTmpMapper;
import cn.tongdun.mybatis.model.DimMilestoneGps;
import cn.tongdun.mybatis.model.DimMilestoneGpsTmp;
import cn.tongdun.mybatis.service.DimMilestoneGpsTmpService;
import cn.tongdun.mybatis.utils.NumToNormal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DimMilestoneGpsTmpServiceImpl implements DimMilestoneGpsTmpService {

    @Autowired
    DimMilestoneGpsTmpMapper dimMilestoneGpsTmpMapper;

    @Autowired
    private DimMilestoneGpsMapper dimMilestoneGpsMapper;

    @Override
    public List<DimMilestoneGpsTmp> queryInfos(DimMilestoneGpsTmp dimMilestoneGpsTmp) {

        List<DimMilestoneGpsTmp> dimMilestoneGpsTmps = dimMilestoneGpsTmpMapper.queryInfos(dimMilestoneGpsTmp);
        return dimMilestoneGpsTmps;

    }

    @Override
    public int batchInsert(DimMilestoneGpsTmp dimMilestoneGpsTmp) {

        List<DimMilestoneGpsTmp> dimMilestoneGpsTmps = dimMilestoneGpsTmpMapper.queryInfos(dimMilestoneGpsTmp);
        for (DimMilestoneGpsTmp milestoneGpsTmp : dimMilestoneGpsTmps) {
            DimMilestoneGps dimMilestoneGps = new DimMilestoneGps();
            String routeBlock = milestoneGpsTmp.getRouteBlock();
            Short direction = milestoneGpsTmp.getDirection();
            String milestone = milestoneGpsTmp.getMilestone();
            String latitude = milestoneGpsTmp.getLatitude();
            String longitude = milestoneGpsTmp.getLongitude();

            dimMilestoneGps.setRouteBlock(routeBlock);
            dimMilestoneGps.setDirection(direction);
            dimMilestoneGps.setMilestone(milestone);
            dimMilestoneGps.setNormMilestone(NumToNormal.getNormalNum(milestone));
            dimMilestoneGps.setLatitude(latitude);
            dimMilestoneGps.setLongitude(longitude);

            dimMilestoneGpsMapper.insertSelective(dimMilestoneGps);
        }
        return 0;
    }
}
