package com.biz.controller;

import com.biz.common.BeanUtil;
import com.biz.common.ResultDTO;
import com.biz.common.ResultDTOBuilder;
import com.biz.component.UserComponent;
import com.biz.constant.*;
import com.biz.domain.SaleMainData;
import com.biz.service.ISaleMainDataClient;
import com.biz.service.ITrackClient;
import com.github.pagehelper.PageInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * sale_main_data表的对应操作
 */
@Controller
@ResponseBody
@RequestMapping("/api/saleMainData/")
public class SaleMainDataController {

    private static final Logger LOG = LoggerFactory.getLogger(SaleMainDataController.class);

    @Autowired
    private UserComponent userComponent;

    @Resource
    private ISaleMainDataClient saleMainDataClient;

    @Resource
    private ITrackClient trackClient;

    /**
     * /api/saleMainData/insert
     * 新增
     */
    @GetMapping("insert")
    public Object insert(SaleMainData saleMainData, HttpServletRequest httpServletRequest) {
        saleMainData.setUploads(userComponent.checkUser(httpServletRequest).getId());
        saleMainData.setBeginDate(new Date());
        saleMainData.setStatus("OPEN");
        ResultDTO<Boolean> result = saleMainDataClient.insert(saleMainData);

        return result;
    }

    /**
     * /api/saleMainData/deleteById/123456789
     * 根据id删除数据
     */
    @GetMapping("deleteById/{id}")
    public Object deleteById(@PathVariable String id) {

        ResultDTO<Boolean> deleteResult = saleMainDataClient.deleteById(id);

        return deleteResult;
    }

    /**
     * 批量删除数据
     * /api/saleMainData/deleteByIds/
     *
     * @param ids 以字符串形式传参 以逗号(,)分割
     * @return
     */
    @GetMapping("deleteByIds/{ids}")
    public Object deleteByIds(@PathVariable String ids) {

        if (StringUtils.isBlank(ids)) {
            return ResultDTOBuilder.failure("10011", "请选择要删除的数据");
        }

        List<String> idList = new ArrayList<String>();

        if (ids.indexOf(",") != -1) {
            String[] split = ids.split(",");
            for (String id : split) {
                idList.add(id);
            }
        } else {
            idList.add(ids);
        }

        ResultDTO<Boolean> deleteResult = saleMainDataClient.deleteByIds(idList);

        return deleteResult;
    }

    /**
     * /api/saleMainData/updataById
     * 根据id修改数据
     */
    @GetMapping("updataById")
    public Object updataById(SaleMainData saleMainData, HttpServletRequest httpServletRequest) {

        saleMainData.setUploads(userComponent.checkUser(httpServletRequest).getId());
        ResultDTO<Boolean> updataResult = saleMainDataClient.updata(saleMainData);

        return updataResult;
    }

    /**
     * 根据id动态修改数据
     * /api/saleMainData/updateByIdSelective
     */
    @GetMapping("updateByIdSelective")
    public Object updateByIdSelective(SaleMainData saleMainData) {

        ResultDTO<Boolean> updateResult = saleMainDataClient.updateByIdSelective(saleMainData);

        return updateResult;
    }

    /**
     * /api/saleMainData/findById/{id}
     * 根据id查询单个
     *
     * @param id
     * @return
     */
    @GetMapping("findById/{id}")
    public Object findById(@PathVariable String id) {

        ResultDTO<SaleMainData> findResult = saleMainDataClient.findById(id);

        return findResult;
    }

    /**
     * 多条件查询
     * /api/saleMainData/findUserBySelective
     * 参数：SaleMainData对象
     * 返回值：List<SaleMainData>
     */
    @GetMapping("findUserBySelective")
    public Object findUserBySelective(SaleMainData saleMainData) {

        ResultDTO<List<SaleMainData>> saleMainDatas = saleMainDataClient.findUserBySelective(saleMainData);
        if (saleMainDatas.getSuccess() && saleMainDatas.getData() != null && saleMainDatas.getData().size() > 0) {
            for (SaleMainData mainData : saleMainDatas.getData()) {
                //将对应value值转成对应的描述
                this.transfer(saleMainData);
            }
        }

        return saleMainDatas;
    }

    /**
     * http://localhost:8088/api/saleMainData/findAll.do?page=1&rows=50
     * /api/saleMainData/findAll/1/10
     * 查询所有
     */
    @GetMapping("findAll")
    public Object findAll(@RequestParam int page, @RequestParam int rows,
                          @RequestParam(required = false, defaultValue = "none") String filterCol) {

        ResultDTO<PageInfo<SaleMainData>> resultDTO = null;


        if (filterCol.equals("none")) {
            resultDTO = saleMainDataClient.associativeSelectAll(page, rows);

        } else if (filterCol.equals("isReal")) {
            resultDTO = saleMainDataClient.associativeSelectAllWithIsReal(page, rows);
        } else if (filterCol.equals("fiveUserUp")) {
            resultDTO = saleMainDataClient.associativeSelectAllWithFiveUp(page, rows);
        } else if (filterCol.equals("seenPolicymaker")) {
            resultDTO = saleMainDataClient.associativeSelectAllWithSeenPol(page, rows);
        }

        if (resultDTO.getSuccess() && resultDTO.getData() != null && resultDTO.getData().getList() != null && resultDTO.getData().getList().size() > 0) {
            for (SaleMainData saleMainData : resultDTO.getData().getList()) {
                //将对应value值转成对应的描述
                this.transfer(saleMainData);
            }
        }



        return resultDTO;
    }

    /**
     * /api/saleMainData/countQuery
     * 统计查询
     */
    @GetMapping("countQuery")
    public Object countQuery() {

        ResultDTO seenPolicymakerResult = saleMainDataClient.countQuery();

        return seenPolicymakerResult;
    }

    //将对应的枚举类型的value值转成对应的描述
    private void transfer(SaleMainData saleMainData) {
        if (saleMainData.getDonePolicymaker() != null) {
            DonePolicymaker donePolicymaker = DonePolicymaker.getByValue(saleMainData.getDonePolicymaker());
            if (donePolicymaker != null) {
                saleMainData.setDonePolicymaker(donePolicymaker.getDesc());
            }
        }

        if (saleMainData.getDonePolicymakerPosition() != null) {
            DonePolicymakerPosition donePolicymakerPosition = DonePolicymakerPosition.getByValue(saleMainData.getDonePolicymakerPosition());
            if (donePolicymakerPosition != null) {
                saleMainData.setDonePolicymakerPosition(donePolicymakerPosition.getDesc());
            }
        }

        if (saleMainData.getFiveUserUp() != null) {
            FiveUserupResult fiveUserup = FiveUserupResult.getByValue(saleMainData.getFiveUserUp());
            if (fiveUserup != null) {
                saleMainData.setFiveUserUp(fiveUserup.getDesc());
            }
        }

        if (saleMainData.getFiveUserUpComment() != null) {
            FiveUserdownResult fiveUserUpComment = FiveUserdownResult.getByValue(saleMainData.getFiveUserUpComment());
            if (fiveUserUpComment != null) {
                saleMainData.setFiveUserUpComment(fiveUserUpComment.getDesc());
            }
        }

        if (saleMainData.getIsReal() != null) {
            IsReal isReal = IsReal.getByValue(saleMainData.getIsReal());
            if (isReal != null) {
                saleMainData.setIsReal(isReal.getDesc());
            }
        }

        if (saleMainData.getIsRealComment() != null) {
            IsRealComment isRealComment = IsRealComment.getByValue(saleMainData.getIsRealComment());
            if (isRealComment != null) {
                saleMainData.setIsRealComment(isRealComment.getDesc());
            }
        }

        if (saleMainData.getNextPolicymakerAction() != null) {
            NextPolicymakerAction nextPolicymakerAction = NextPolicymakerAction.getByValue(saleMainData.getNextPolicymakerAction());
            if (nextPolicymakerAction != null) {
                saleMainData.setNextPolicymakerAction(nextPolicymakerAction.getDesc());
            }
        }

        if (saleMainData.getNextReqAction() != null) {
            NextReqAction nextReqAction = NextReqAction.getByValue(saleMainData.getNextReqAction());
            if (nextReqAction != null) {
                saleMainData.setNextReqAction(nextReqAction.getDesc());
            }
        }

        if (saleMainData.getPolicymakerPosition() != null) {
            PolicymakerPosition policymakerPosition = PolicymakerPosition.getByValue(saleMainData.getPolicymakerPosition());
            if (policymakerPosition != null) {
                saleMainData.setPolicymakerPosition(policymakerPosition.getDesc());
            }
        }

        if (saleMainData.getStatus() != null) {
            SaleMainStatus saleMainStatus = SaleMainStatus.getByValue(saleMainData.getStatus());
            if (saleMainStatus != null) {
                saleMainData.setStatus(saleMainStatus.getDesc());
            }
        }

        if (saleMainData.getSeenPolicymaker() != null) {
            SeenPolicymaker seenPolicymaker = SeenPolicymaker.getByValue(saleMainData.getSeenPolicymaker());
            if (seenPolicymaker != null) {
                saleMainData.setSeenPolicymaker(seenPolicymaker.getDesc());
            }
        }
    }

    /**
     * 此调用可以使用上面的根据id动态修改数据 updateByIdSelective
     * /api/saleMainData/resetSaleMainDataStatus/021eda0a82b346e9bda511aac47d2d53/CLOSE
     * 重置(关闭/重新打开)status状态
     */
    @Deprecated
    @GetMapping("resetSaleMainDataStatus/{id}/{status}")
    public Object resetSaleMainDataStatus(@PathVariable String id, @PathVariable String status) {

        ResultDTO resultDTO = saleMainDataClient.resetStatusById(id, status);

        return resultDTO;
    }

    /**
     * /api/saleMainData/deleteById/123456789
     * 根据id删除数据
     */
    @GetMapping("updatePriById")
    public Object updatePriById(SaleMainData saleMainData,HttpServletRequest httpServletRequest) {

        saleMainData.setUploads(userComponent.checkUser(httpServletRequest).getId());

        ResultDTO<Boolean> deleteResult = saleMainDataClient.updatePriById(saleMainData);

        return deleteResult;
    }
}
