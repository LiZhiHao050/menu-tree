package com.example.controller;


import com.example.service.IMenusService;
import com.example.vo.MenusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzh
 * @since 2020-08-11
 */
@Controller
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private IMenusService menusService;

    @RequestMapping("/list")
    public List<MenusVo> list() {
        List<MenusVo> menusVos = menusService.menusList();
        for (MenusVo menusVo : menusVos) {
            System.out.println(menusVo);
        }
        return menusVos;
    }

}

