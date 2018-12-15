package com.lwb.dubbo.service.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.ID_WORKER)
    Long id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    Date createTime;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    Date updateTime;

}
