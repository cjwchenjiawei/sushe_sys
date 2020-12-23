package com.cjw.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
@TableName(value = "t_permission")
public class Permission implements Serializable {
    @TableId(value = "permission_id", type = IdType.AUTO)
    private Integer permissionId;

    @TableField(value = "permission_name")
    private String permissionName;

    @TableField(value = "permission_info")
    private String permissionInfo;

    @TableField(value = "module_url")
    private String moduleUrl;

    /**
     * 父亲id，自引用
     */
    @TableField(value = "pid")
    private Integer pid;


    private static final long serialVersionUID = 1L;

    public static final String COL_PERMISSION_ID = "permission_id";

    public static final String COL_PERMISSION_NAME = "permission_name";

    public static final String COL_PERMISSION_INFO = "permission_info";

    public static final String COL_MODULE_URL = "module_url";

    public static final String COL_PID = "pid";
}