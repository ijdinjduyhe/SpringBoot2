package com.annie.controller;


import com.annie.entity.User;
import com.annie.mapper.UserMapper;
import com.annie.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/test")
    @ResponseBody
    public List<User> getName() {

        // 参数1：当前页数
        // 参数2：每页显示的数量
        PageHelper.startPage(3, 2);
        List<User> user = userMapper.selectByExample(null);
        // 分页的各种信息。保存在pageInfo中。可打断点查看具体内容。
        PageInfo pageInfo = new PageInfo(user);
        // 分页要显示的信息保存在 List（变量）中。getList() 获取数据。
        List list = pageInfo.getList();






        System.out.println("当前页:" + pageInfo.getPageNum());
        System.out.println("每页的数量:" + pageInfo.getPageSize());
        System.out.println("当前页显示的数量:" + pageInfo.getSize());


        //由于startRow和endRow不常用，这里说个具体的用法
        // 可以在页面中"显示startRow到endRow 共size条数据"
        // 当前页面第一个元素在数据库中的行号
        // 当前页面最后一个元素在数据库中的行号
        System.out.println("显示" + pageInfo.getStartRow() + "到" + pageInfo.getEndRow() + "共" + pageInfo.getSize() + "条数据");
        System.out.println("当前页面第一个元素在数据库中的行号: " + pageInfo.getStartRow());
        System.out.println("当前页面最后一个元素在数据库中的行号: " + pageInfo.getEndRow());
        System.out.println("总记录数: " + pageInfo.getTotal());
        System.out.println("总页数: " + pageInfo.getPages());
        System.out.println("前一页：" + pageInfo.getPrePage());
        System.out.println("下一页:" + pageInfo.getNextPage());
        System.out.println("是否为第一页:" + pageInfo.isIsFirstPage());
        System.out.println("是否为最后一页:" + pageInfo.isIsLastPage());
        System.out.println("是否有前一页:" + pageInfo.isHasPreviousPage());
        System.out.println("是否有下一页:" + pageInfo.isHasNextPage());
        System.out.println("导航页码数:" + pageInfo.getNavigatePages());
        System.out.println("所有导航页码数:");

        for (int i : pageInfo.getNavigatepageNums()) {
            System.out.println(" " + i + ",");
        }


        return list;
    }

}
