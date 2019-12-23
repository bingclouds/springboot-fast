package cn.tongdun.mybatis.controller;

import cn.tongdun.mybatis.model.User;
import cn.tongdun.mybatis.service.UserService;
import cn.tongdun.mybatis.utils.CephServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Created by PhychoLee on 2016/10/13.
 * Description:
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public User getUser() {
        User user = null;
        try {
            user = userService.findById(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @RequestMapping(value = "/bucket", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public CephServerResponse listObjects(@RequestParam(value = "bucketName", required = true) String bucketName,
                                          @RequestParam(value = "prefix") String prefix) {
        return CephServerResponse.createSuccess(bucketName);
    }

    @RequestMapping(value = "/jobInfo")
    public CephServerResponse createCommonJob(HttpServletRequest httpServletRequest,
                                              HttpServletResponse httpServletResponse,
                                              String jobInfo) throws InterruptedException {
        return CephServerResponse.createSuccess(jobInfo + "请求成功");
    }

}
