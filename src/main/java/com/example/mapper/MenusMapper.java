package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Menus;
import com.example.vo.MenusVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzh
 * @since 2020-08-11
 */

@Mapper
@Repository
public interface MenusMapper extends BaseMapper<Menus> {

    List<MenusVo> menusList();

}
