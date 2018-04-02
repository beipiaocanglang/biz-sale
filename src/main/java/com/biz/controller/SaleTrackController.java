package com.biz.controller;

import com.biz.common.IDUtils;
import com.biz.common.ResultDTO;
import com.biz.component.UserComponent;
import com.biz.domain.SaleLoginUser;
import com.biz.domain.SaleTrack;
import com.biz.domain.TrackBO;
import com.biz.service.ITrackClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;


@Controller
@ResponseBody
@RequestMapping("/api/saleTrack/")
public class SaleTrackController {

    @Resource
    private UserComponent userComponent;

    @Resource
    private ITrackClient trackClient;

    @GetMapping("findAll")
    public Object findAll() {

        return trackClient.findAllTrack();

    }

    @GetMapping("findById")
    public Object findById(@RequestParam String id) {

        return trackClient.findById(id);

    }

    @GetMapping("findTodayTrackById")
    public Object findTodayTrackById(@RequestParam String id) {

        return trackClient.findById(id);

    }


    @GetMapping("findCusTrackByDate")
    public Object findCusTrackByDate(@RequestParam String id, @RequestParam Date start, @RequestParam Date end) {

        ResultDTO<List<SaleTrack>> result = trackClient.selectByIdAndDate(id,start,end);

        Map<String,TrackBO> trackBOMap = new LinkedHashMap<String, TrackBO>();
        if(result.getSuccess()){


            for(SaleTrack track : result.getData()){

                if(track.getType()==1){

                    TrackBO trackBO =new TrackBO();
                    trackBO.setTrack(track);
                    trackBO.setResponseTrack(new ArrayList<SaleTrack>());

                    trackBOMap.put(track.getId(),trackBO);
                }


            }

            for(SaleTrack track : result.getData()){

                if(track.getType()==2){

                    TrackBO trackBO = trackBOMap.get(track.getFlowParent());

                    if(trackBO!=null) {

                        trackBO.getResponseTrack().add(track);
                    }
                }


            }


        }


        ResultDTO<Object> finalResult = new ResultDTO<Object>();
        finalResult.setSuccess(result.getSuccess());
        finalResult.setData(trackBOMap);
        finalResult.setErrMsg(result.getErrMsg());
        finalResult.setErrCode(result.getErrCode());

        return finalResult;

    }

    @GetMapping("insertNewTrack")
    public Object insertNewTrack(SaleTrack saleTrack, HttpServletRequest request) {


        SaleLoginUser user = userComponent.checkUser(request);

        saleTrack.setUpdateUser(user.getId());
        saleTrack.setId(IDUtils.genratorCode());
        saleTrack.setType(1);
        saleTrack.setDeleted(0);

        return trackClient.insertNewTrack(saleTrack);

    }

    @GetMapping("insertResponseTrack")
    public Object insertResponseTrack(SaleTrack saleTrack, HttpServletRequest request) {


        SaleLoginUser user = userComponent.checkUser(request);

        saleTrack.setUpdateUser(user.getId());
        saleTrack.setId(IDUtils.genratorCode());
        saleTrack.setType(2);
        saleTrack.setDeleted(0);


        return trackClient.insertNewTrack(saleTrack);

    }

}
