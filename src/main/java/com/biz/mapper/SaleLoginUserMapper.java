package com.biz.mapper;

import com.biz.domain.SaleLoginUser;
import com.biz.domain.SaleLoginUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SaleLoginUserMapper {
    /**
     * 新增数据
     * @param saleLoginUser
     * @return
     */
    int save(SaleLoginUser saleLoginUser);

    /**
     * 查询用户表中的所有数据
     * @return
     */
    List<SaleLoginUser> selectAll();

    /**
     * 根据用户名查询用户信息
     */
    SaleLoginUser findUserByLoginName(String loginName);

    /**
     * 多条件查询
     * @param saleLoginUser
     * @return
     */
    List<SaleLoginUser> findUserSelective(SaleLoginUser saleLoginUser);

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    SaleLoginUser selectById(String userId);

    /**
     * 多条件统计查询
     * @param saleLoginUser
     * @return
     */
    int countBySelective(SaleLoginUser saleLoginUser);

    /**
     * 根据ID修改数据
     * @param userId
     * @return
     */
    int updateById(String userId);

    /**
     * 根据ID动态修改数据
     * @param userId
     * @return
     */
    int updateByIdSelective(String userId);

    /**
     * 根据ID删除数据
     * @param userId
     * @return
     */
    int deleteById(String userId);

    /**
     * 删除所有数据
     * @return
     */
    int deleteAll();
}