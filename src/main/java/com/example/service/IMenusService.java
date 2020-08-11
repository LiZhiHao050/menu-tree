package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Menus;
import com.example.vo.MenusVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzh
 * @since 2020-08-11
 */
public interface IMenusService extends IService<Menus> {

    List<MenusVo> menusList();

}
