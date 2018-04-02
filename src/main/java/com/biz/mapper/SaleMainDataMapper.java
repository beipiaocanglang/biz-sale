package com.biz.mapper;

import com.biz.domain.SaleMainData;
import com.biz.domain.SaleMainDataExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SaleMainDataMapper {
    /**
     * 新增数据
     * @param saleMainData
     * @return
     */
    int save(SaleMainData saleMainData);

    /**
     * 查询用户表中的所有数据
     * @return
     */
    List<SaleMainData> selectAll();

    /**
     * 关联查询用户表中的所有数据
     * @return
     */
    List<SaleMainData> associativeSelectAll();

    /**
     * 关联查询用户表中的所有数据
     * @return
     */
    List<SaleMainData> associativeSelectAllWithIsReal();

    /**
     * 关联查询用户表中的所有数据
     * @return
     */
    List<SaleMainData> associativeSelectAllWithSeenPol();

    /**
     * 关联查询用户表中的所有数据
     * @return
     */
    List<SaleMainData> associativeSelectAllWithFiveUp();

    /**
     * 多条件查询
     * @param saleMainData
     * @return
     */
    List<SaleMainData> findSaleMainDataBySelective(SaleMainData saleMainData);

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    SaleMainData selectById(String userId);

    /**
     * 多条件统计查询
     * @param saleMainData
     * @return
     */
    int countBySelective(SaleMainData saleMainData);

    /**
     * 根据Example动态查询
     */
    List<SaleMainData> selectByExample(SaleMainDataExample example);

    /**
     * 根据Example统计查询
     */
    int countByExample(SaleMainDataExample example);

    /**
     * 根据ID修改数据
     * @param saleMainData
     * @return
     */
    int updateById(SaleMainData saleMainData);

    int updatePriById(SaleMainData saleMainData);

    /**
     * 根据ID动态修改数据
     * @param saleMainData
     * @return
     */
    int updateByIdSelective(SaleMainData saleMainData);

    /**
     * 根据ID删除数据
     * @param userId
     * @return
     */
    int deleteById(String userId);

    /**
     * 批量删除(根据多个id)
     */
    int deleteByIds(List<String> ids);

    /**
     * 删除所有数据
     * @return
     */
    int deleteAll();

    /**
     * 关闭/重新打开status状态
     * @param id
     * @param status
     * @return
     */
    int resetSaleMainDataStatusById(String id, String status);
}