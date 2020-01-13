package cn.tongdun.mybatis.controller;

import cn.tongdun.mybatis.model.DimMilestoneGpsTmp;
import cn.tongdun.mybatis.service.DimMilestoneGpsService;
import cn.tongdun.mybatis.service.DimMilestoneGpsTmpService;
import cn.tongdun.mybatis.utils.CephServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class OptionController {

    @Autowired
    private DimMilestoneGpsTmpService dimMilestoneGpsTmpService;

    @Autowired
    private DimMilestoneGpsService dimMilestoneGpsService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public CephServerResponse listObjects() {
        DimMilestoneGpsTmp dimMilestoneGpsTmp = new DimMilestoneGpsTmp();
        List<DimMilestoneGpsTmp> dimMilestoneGpsTmps = dimMilestoneGpsTmpService.queryInfos(dimMilestoneGpsTmp);
        return CephServerResponse.createSuccess(dimMilestoneGpsTmps);
    }

    @RequestMapping(value = "/batchInsert", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public CephServerResponse batchInsert() {
        DimMilestoneGpsTmp dimMilestoneGpsTmp = new DimMilestoneGpsTmp();
        int i = dimMilestoneGpsTmpService.batchInsert(dimMilestoneGpsTmp);
        return CephServerResponse.createSuccess(i);
    }


    // insertSelective
    @RequestMapping(value = "/insertSelective", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public CephServerResponse insertSelective() {
        int i = dimMilestoneGpsService.insertSelective();
        return CephServerResponse.createSuccess(i);
    }
}
