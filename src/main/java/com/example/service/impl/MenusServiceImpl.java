package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Menus;
import com.example.mapper.MenusMapper;
import com.example.service.IMenusService;
import com.example.vo.MenusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzh
 * @since 2020-08-11
 */
@Service
public class MenusServiceImpl extends ServiceImpl<MenusMapper, Menus> implements IMenusService {

    @Autowired
    private MenusMapper menusMapper;

    @Override
    public List<MenusVo> menusList() {
        return menusMapper.menusList();
    }
}
