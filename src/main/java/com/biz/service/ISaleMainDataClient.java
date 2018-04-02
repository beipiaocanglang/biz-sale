package com.biz.service;

import com.biz.common.ResultDTO;
import com.biz.domain.SaleMainData;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ISaleMainDataClient {

    /**
     * 新增
     * @param saleMainData
     * @return
     */
    ResultDTO<Boolean> insert(SaleMainData saleMainData);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    ResultDTO<Boolean> deleteById(String id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    ResultDTO<Boolean> deleteByIds(List<String> ids);

    /**
     * 根据id修改数据
     * @param saleMainData
     * @return
     */
    ResultDTO<Boolean> updata(SaleMainData saleMainData);

    ResultDTO<Boolean> updatePriById(SaleMainData saleMainData);

    /**
     * 根据id动态修改数据
     * @param saleMainData
     * @return
     */
    ResultDTO<Boolean> updateByIdSelective(SaleMainData saleMainData);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    ResultDTO<SaleMainData> findById(String id);

    /**
     * 多条件查询
     * @param saleMainData
     * @return
     */
    ResultDTO<List<SaleMainData>> findUserBySelective(SaleMainData saleMainData);

    /**
     * 查询所有
     * @param page
     * @param rows
     * @return
     */
    ResultDTO<PageInfo<SaleMainData>> associativeSelectAll(int page, int rows);

    ResultDTO<PageInfo<SaleMainData>> associativeSelectAllWithIsReal(int page, int rows);

    ResultDTO<PageInfo<SaleMainData>> associativeSelectAllWithSeenPol(int page, int rows);

    ResultDTO<PageInfo<SaleMainData>> associativeSelectAllWithFiveUp(int page, int rows);

    /**
     * 统计查询
     * @return
     */
    ResultDTO countQuery();

    /**
     * 关闭/重新打开status状态
     * @param id
     * @param status
     * @return
     */
    ResultDTO resetStatusById(String id, String status);
}
