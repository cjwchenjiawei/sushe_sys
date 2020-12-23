package com.cjw.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "t_student")
public class Student implements Serializable {
    @TableId(value = "stu_id", type = IdType.AUTO)
    private Integer stuId;

    @TableField(value = "stu_name")
    private String stuName;

    @TableField(value = "stu_gender")
    private String stuGender;

    @TableField(value = "stu_tel")
    private String stuTel;

    @TableField(value = "stu_intime")
    private Date stuIntime;

    @TableField(value = "stu_headPic")
    private String stuHeadpic;

    @javax.persistence.Transient
    @TableField(exist = false)
    private MyClass myClass;

    @javax.persistence.Transient
    @TableField(exist = false)
    private Home home;



    private static final long serialVersionUID = 1L;

    public static final String COL_STU_ID = "stu_id";

    public static final String COL_STU_NAME = "stu_name";

    public static final String COL_STU_GENDER = "stu_gender";

    public static final String COL_STU_TEL = "stu_tel";

    public static final String COL_STU_INTIME = "stu_intime";

    public static final String COL_FK_CLASS_ID = "fk_class_id";

    public static final String COL_FK_HOME_ID = "fk_home_id";

    public static final String COL_STU_HEADPIC = "stu_headPic";
}