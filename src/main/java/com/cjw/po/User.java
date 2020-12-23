package com.cjw.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
@TableName(value = "t_user")
public class User implements Serializable {
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "user_password")
    private String userPassword;

    @TableField(value = "user_nickname")
    private String userNickname;

    @TableField(value = "user_reg_time")
    private Date userRegTime;

    @TableField(exist = false)
    @javax.persistence.Transient
    private List<Role>roles;

    @TableField(exist = false)
    @javax.persistence.Transient
    private List<Permission>permissions;

    private static final long serialVersionUID = 1L;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_PASSWORD = "user_password";

    public static final String COL_USER_NICKNAME = "user_nickname";

    public static final String COL_USER_REG_TIME = "user_reg_time";
}