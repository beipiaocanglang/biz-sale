package com.biz.service.impl;

import com.biz.common.IDUtils;
import com.biz.common.JsonUtil;
import com.biz.common.ResultDTO;
import com.biz.common.ResultDTOBuilder;
import com.biz.constant.FiveUserupResult;
import com.biz.constant.IsReal;
import com.biz.constant.SaleMainStatus;
import com.biz.constant.SeenPolicymaker;
import com.biz.domain.SaleMainData;
import com.biz.domain.SaleMainDataExample;
import com.biz.mapper.SaleMainDataMapper;
import com.biz.service.ISaleMainDataClient;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SaleMainDataImpl implements ISaleMainDataClient{

    private static final Logger log = LoggerFactory.getLogger(SaleMainDataImpl.class);

    @Resource
    private SaleMainDataMapper saleMainDataMapper;

    /**
     * 插入
     * @param saleMainData
     * @return
     */
    public ResultDTO<Boolean> insert(SaleMainData saleMainData) {
        saleMainData.setId(IDUtils.currentTimeMillis());
        saleMainData.setBeginDate(new Date());
        saleMainData.setUpdateDate(new Date());
        saleMainData.setStatus(SaleMainStatus.OPEN.getValue());

        try {
            int insert = saleMainDataMapper.save(saleMainData);

            if (insert != 1) {
                return ResultDTOBuilder.failure("10007", "数据添加失败，请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            log.error("保存sale_main_data对象数据(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public ResultDTO<Boolean> deleteById(String id) {
        try {
            int isDetlete = saleMainDataMapper.deleteById(id);

            if (isDetlete != 1) {
                return ResultDTOBuilder.failure("10007", "数据添加失败，请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            log.error("impl - 根据ID删除sale_main_data表中数据时的结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public ResultDTO<Boolean> deleteByIds(List<String> ids) {

        try {
            int deleteResult = saleMainDataMapper.deleteByIds(ids);

            if (deleteResult < 1) {
                return ResultDTOBuilder.failure("10010", "批量删除失败，请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 修改
     * @param saleMainData
     * @return
     */
    public ResultDTO<Boolean> updata(SaleMainData saleMainData) {
        try {
            saleMainData.setUpdateDate(new Date());
            int isUpdata = saleMainDataMapper.updateById(saleMainData);

            if (isUpdata != 1) {
                return ResultDTOBuilder.failure("10007", "修改失败，请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            log.error("impl - 根据ID修改sale_main_data表中数据时的返回结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }


    public ResultDTO<Boolean> updatePriById(SaleMainData saleMainData){
        try {
            saleMainData.setUpdateDate(new Date());
            int isUpdata = saleMainDataMapper.updatePriById(saleMainData);

            if (isUpdata != 1) {
                return ResultDTOBuilder.failure("10007", "修改失败，请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            log.error("impl - 根据ID修改sale_main_data表中Pri时的返回结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 根据id查询单个
     * @param id
     * @return
     */
    public ResultDTO<SaleMainData> findById(String id) {
        try {
            SaleMainData saleMainData = saleMainDataMapper.selectById(id);

            return ResultDTOBuilder.success(saleMainData);
        } catch (Exception e) {
            log.error("impl - 根据ID查询sale_main_data表中单个数据的查询结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 根据id动态修改数据
     * @param saleMainData
     * @return
     */
    public ResultDTO<Boolean> updateByIdSelective(SaleMainData saleMainData) {

        try {
            int updateResult = saleMainDataMapper.updateByIdSelective(saleMainData);

            if (updateResult<1) {
                return ResultDTOBuilder.failure("10012", "修改失败,请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            log.error("impl - 根据id动态修改数据(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 多条件查询
     * 参数：SaleMainDataWithBLOBs对象
     * 返回值：List<SaleMainData>
     */
    public ResultDTO<List<SaleMainData>> findUserBySelective(SaleMainData saleMainData) {

        try {
            List<SaleMainData> saleMainDatas = saleMainDataMapper.findSaleMainDataBySelective(saleMainData);

            return ResultDTOBuilder.success(saleMainDatas);
        } catch (Exception ex) {
            log.error("impl - 多条件查询sale_main_data表中数据结果(异常)：", ex);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 分页查询全部
     * @return
     */
    public ResultDTO<PageInfo<SaleMainData>> associativeSelectAll(int page, int rows) {
        try {
            //查询前设置分页信息
            PageHelper.startPage(page, rows);

            List<SaleMainData> saleMainDatas = saleMainDataMapper.associativeSelectAll();

            //创建PageInfo对象
            PageInfo<SaleMainData> pageInfo = new PageInfo<SaleMainData>(saleMainDatas);

            return ResultDTOBuilder.success(pageInfo);
        } catch (Exception e) {
            log.error("impl - 分页查询全部(sale_main_data表)的查询结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 分页查询全部isreal
     * @return
     */
    public ResultDTO<PageInfo<SaleMainData>> associativeSelectAllWithIsReal(int page, int rows) {
        try {
            //查询前设置分页信息
            PageHelper.startPage(page, rows);

            List<SaleMainData> saleMainDatas = saleMainDataMapper.associativeSelectAllWithIsReal();

            //创建PageInfo对象
            PageInfo<SaleMainData> pageInfo = new PageInfo<SaleMainData>(saleMainDatas);

            return ResultDTOBuilder.success(pageInfo);
        } catch (Exception e) {
            log.error("impl - 分页查询全部(sale_main_data表)的查询结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 分页查询全部WithSeen
     * @return
     */
    public ResultDTO<PageInfo<SaleMainData>> associativeSelectAllWithSeenPol(int page, int rows) {
        try {
            //查询前设置分页信息
            PageHelper.startPage(page, rows);

            List<SaleMainData> saleMainDatas = saleMainDataMapper.associativeSelectAllWithSeenPol();

            //创建PageInfo对象
            PageInfo<SaleMainData> pageInfo = new PageInfo<SaleMainData>(saleMainDatas);

            return ResultDTOBuilder.success(pageInfo);
        } catch (Exception e) {
            log.error("impl - 分页查询全部(sale_main_data表)的查询结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 分页查询全部WithFiveUp
     * @return
     */
    public ResultDTO<PageInfo<SaleMainData>> associativeSelectAllWithFiveUp(int page, int rows) {
        try {
            //查询前设置分页信息
            PageHelper.startPage(page, rows);

            List<SaleMainData> saleMainDatas = saleMainDataMapper.associativeSelectAllWithFiveUp();

            //创建PageInfo对象
            PageInfo<SaleMainData> pageInfo = new PageInfo<SaleMainData>(saleMainDatas);

            return ResultDTOBuilder.success(pageInfo);
        } catch (Exception e) {
            log.error("impl - 分页查询全部(sale_main_data表)的查询结果(异常)：", e);
            return ResultDTOBuilder.failure("10007", "服务异常，请稍后重试");
        }
    }

    /**
     * 统计查询
     * 临时写成固定sql，后期封装数据
     */
    public ResultDTO countQuery(){

        int StatusNum = 0;
        int seenPolicymakerNum = 0;
        int isRealNum = 0;
        int fiveUserupIsRealNum = 0;

        try {
            SaleMainDataExample example = new SaleMainDataExample();
            SaleMainDataExample.Criteria criteria = example.or();
            criteria.andStatusNotEqualTo(SaleMainStatus.CLOSE.getValue());

            //统计状态不是关闭的数据
            StatusNum = saleMainDataMapper.countByExample(example);

        } catch (Exception e) {
            log.error("统计状态不是关闭的数据(异常)", e);
        }

        try {
            SaleMainDataExample example = new SaleMainDataExample();
            SaleMainDataExample.Criteria criteria = example.or();
            criteria.andStatusNotEqualTo(SaleMainStatus.CLOSE.getValue());
            criteria.andSeenPolicymakerEqualTo(SeenPolicymaker.YES.getValue());

            //统计seen_policy_maker状态是已经见到决策人,并且status!=cloes的数据
            seenPolicymakerNum = saleMainDataMapper.countByExample(example);

        } catch (Exception e) {
            log.error("统计seen_policy_maker状态是已经见到决策人(异常)", e);
        }

        try {
            SaleMainDataExample example = new SaleMainDataExample();
            SaleMainDataExample.Criteria criteria = example.or();
            criteria.andStatusNotEqualTo(SaleMainStatus.CLOSE.getValue());
            criteria.andIsRealIsNotNull();
            criteria.andIsRealNotEqualTo(IsReal.NO.getValue());

            //统计is_real字段状态不是null并且status!=cloes的数据
            isRealNum = saleMainDataMapper.countByExample(example);

        } catch (Exception e) {
            log.error("统计is_real字段状态不是null(异常)", e);
        }

        try {
            SaleMainDataExample example = new SaleMainDataExample();
            SaleMainDataExample.Criteria criteria = example.or();
            criteria.andStatusNotEqualTo(SaleMainStatus.CLOSE.getValue());
            criteria.andFiveUserUpIsNotNull();
            criteria.andFiveUserUpNotEqualTo(FiveUserupResult.NO.getValue());

            //统计five_user_up字段状态不是null并且status!=cloes的数据
            fiveUserupIsRealNum = saleMainDataMapper.countByExample(example);

        } catch (Exception e) {
            log.error("统计five_user_up字段状态不是null(异常)", e);
        }

        Map<String, Integer> finalMap = new LinkedHashMap<String, Integer>();
        finalMap.put("statusIsNotCloseNum", StatusNum);
        finalMap.put("seenPolicymakerNum", seenPolicymakerNum);
        finalMap.put("isRealNum", isRealNum);
        finalMap.put("fiveUserupNum", fiveUserupIsRealNum);

        return ResultDTOBuilder.success(finalMap);
    }

    /**
     * 关闭/重新打开status状态
     */
    public ResultDTO resetStatusById(String id, String status) {

        try {
            int closeResult = saleMainDataMapper.resetSaleMainDataStatusById(id, status);

            if (closeResult != 1) {
                return ResultDTOBuilder.failure("10007", status.equalsIgnoreCase("close")? "关闭":"打开" + "失败，请稍后重试");
            }

            return ResultDTOBuilder.success(closeResult);
        } catch (Exception e) {
            log.error("impl - 重置状态结果(异常)：", e);
            return ResultDTOBuilder.failure("10009", "服务异常，请稍后重试");
        }
    }
}
