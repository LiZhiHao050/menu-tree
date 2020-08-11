package com.example.vo;

import com.example.entity.Menus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString()
public class MenusVo extends Menus {

    private List<Menus> children;

}
