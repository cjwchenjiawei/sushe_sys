package com.cjw.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@Data
@TableName(value = "t_role")
public class Role implements Serializable {
    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;

    @TableField(value = "role_name")
    private String roleName;

    @TableField(value = "role_info")
    private String roleInfo;

    @TableField(value = "role_level")
    private Integer roleLevel;

    private static final long serialVersionUID = 1L;

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_ROLE_NAME = "role_name";

    public static final String COL_ROLE_INFO = "role_info";

    public static final String COL_ROLE_LEVEL = "role_level";
}