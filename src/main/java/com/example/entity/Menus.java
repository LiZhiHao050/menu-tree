package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lzh
 * @since 2020-08-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ToString
public class Menus implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "m_id")
    private Integer mId;

    private String mName;

    private Integer mPid;


}
