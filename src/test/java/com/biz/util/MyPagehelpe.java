package com.biz.util;

import com.biz.domain.SaleMainData;
import com.biz.mapper.SaleMainDataMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyPagehelpe {

    /**
     * 测试pagehelper分页插件
     * @author canglang
     */
    @Test
    public void pagehelperTest(){
        //加载spring的配置文件,获取itenMapper接口代理对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext-dao.xml");
        //获取TbItenMapper接口代理对象
        SaleMainDataMapper itemMapper = ac.getBean(SaleMainDataMapper.class);
        //查询所有之前设置分页信息：使用Pagehelper插件
        PageHelper.startPage(0, 10);//参数1：其实位置(从0开始)、参数2：每一页的长度
        //上面不设置参数查询 所有
        List<SaleMainData> itemList = itemMapper.selectAll();
        //获取分页信息，pagehelper将分页信息封装到PageInfo对象中
        PageInfo<SaleMainData> pageInfo = new PageInfo<SaleMainData>(itemList);

        System.out.println("分页总记录数："+pageInfo.getTotal());
        System.out.println("所有分页信息："+pageInfo.getPages());
    }
}
