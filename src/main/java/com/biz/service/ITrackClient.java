package com.biz.service;

import com.biz.common.ResultDTO;
import com.biz.domain.SaleTrack;

import java.util.Date;
import java.util.List;

public interface ITrackClient {


    /**
     * ceshi test
     * @return
     */
    ResultDTO<List<SaleTrack>> findAllTrack();



    ResultDTO<SaleTrack> findById(String id);


    ResultDTO<List<SaleTrack>> selectByIdAndDate(String id, Date beginTime, Date endTime);

    ResultDTO<SaleTrack> insertNewTrack(SaleTrack saleTrack);


}
