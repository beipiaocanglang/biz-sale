package com.biz.service.impl;


import com.biz.common.ResultDTO;
import com.biz.domain.SaleTrack;
import com.biz.mapper.SaleTrackMapper;
import com.biz.service.ITrackClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TrackImpl implements ITrackClient {

    @Resource
    private SaleTrackMapper saleTrackMapper;

    public ResultDTO<List<SaleTrack>> findAllTrack() {


        List<SaleTrack> resultDataList = new ArrayList<SaleTrack>();
        ResultDTO result = new ResultDTO();

        try {

            result.setSuccess(true);
            result.setErrCode("");
            result.setErrMsg("");
            result.setData(saleTrackMapper.selectAll());


        } catch (Exception ex) {
            result.setSuccess(false);
            result.setErrCode(ex.toString());
            result.setErrMsg(ex.getMessage());
            result.setData(resultDataList);


        }
        return result;

    }

    public ResultDTO<SaleTrack> findById(String id) {

        ResultDTO result = new ResultDTO();

        try {
            result.setSuccess(true);
            result.setErrCode("");
            result.setErrMsg("");
            result.setData(saleTrackMapper.selectById(id));


        } catch (Exception ex) {
            result.setSuccess(false);
            result.setErrCode(ex.toString());
            result.setErrMsg(ex.getMessage());
            result.setData(null);


        }

        return result;
    }


    public ResultDTO<List<SaleTrack>> selectByIdAndDate(String id, Date beginTime, Date endTime) {
        List<SaleTrack> resultDataList = new ArrayList<SaleTrack>();
        ResultDTO result = new ResultDTO();

        try {
            result.setSuccess(true);
            result.setErrCode("");
            result.setErrMsg("");
            result.setData(saleTrackMapper.selectByIdAndDate(id, beginTime, endTime));


        } catch (Exception ex) {
            result.setSuccess(false);
            result.setErrCode(ex.toString());
            result.setErrMsg(ex.getMessage());
            result.setData(resultDataList);


        }

        return result;
    }


    public ResultDTO<SaleTrack> insertNewTrack(SaleTrack saleTrack){

        ResultDTO result = new ResultDTO();

        try {
            result.setSuccess(true);
            result.setErrCode("");
            result.setErrMsg("");

            int resultRow = saleTrackMapper.insertNewTrack(saleTrack);
            result.setData(null);
            if(resultRow==1){
                result.setData(saleTrack);
            }




        } catch (Exception ex) {
            result.setSuccess(false);
            result.setErrCode(ex.toString());
            result.setErrMsg(ex.getMessage());
            result.setData(null);


        }

        return result;
    }
}
