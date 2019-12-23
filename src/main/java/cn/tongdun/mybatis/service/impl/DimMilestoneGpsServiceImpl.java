package cn.tongdun.mybatis.service.impl;

import cn.tongdun.mybatis.mapper.DimMilestoneGpsMapper;
import cn.tongdun.mybatis.model.DimMilestoneGps;
import cn.tongdun.mybatis.service.DimMilestoneGpsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DimMilestoneGpsServiceImpl implements DimMilestoneGpsService {

    @Autowired
    private DimMilestoneGpsMapper dimMilestoneGpsMapper;

    @Override
    public int insertSelective() {
        DimMilestoneGps dimMilestoneGps = new DimMilestoneGps();
        dimMilestoneGps.setRouteBlock("G101");
        dimMilestoneGps.setDirection((short) 0);
        dimMilestoneGps.setMilestone("2.9");
        dimMilestoneGps.setNormMilestone("K2+900");
        dimMilestoneGps.setLatitude("29.891473");
        dimMilestoneGps.setLongitude("121.44676");
        return dimMilestoneGpsMapper.insertSelective(dimMilestoneGps);
    }
}
