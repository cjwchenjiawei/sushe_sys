package com.cjw.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "t_class")
public class MyClass implements Serializable {
    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer classId;

    @TableField(value = "class_name")
    private String className;

    @TableField(value = "class_teacher")
    private String classTeacher;

    @TableField(value = "class_time")
    private Date classTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_CLASS_ID = "class_id";

    public static final String COL_CLASS_NAME = "class_name";

    public static final String COL_CLASS_TEACHER = "class_teacher";

    public static final String COL_CLASS_TIME = "class_time";
}