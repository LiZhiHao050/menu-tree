package com.example.controller;


import com.example.service.IMenusService;
import com.example.vo.MenusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzh
 * @since 2020-08-11
 */
@RestController
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

    @RequestMapping("/testParam")
//    public String testParam(@RequestBody Map<String, String> params) {
    public String testParam(@RequestParam("monId") String monId,
                            @RequestParam("edisId") String edisId) {
//        String monId = params.get("monId");
//        String edisId = params.get("edisId");
        System.out.println("MonId:" + monId);
        System.out.println("EDISId:" + edisId);
        return monId + ", " + edisId;
    }

}

