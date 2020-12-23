package com.cjw.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "t_home")
public class Home implements Serializable {
    @TableId(value = "home_id", type = IdType.AUTO)
    private Integer homeId;

    @TableField(value = "home_address")
    private String homeAddress;

    @TableField(value = "home_maxnum")
    private Integer homeMaxnum;

    @TableField(value = "home_innum")
    private Integer homeInnum;

    @TableField(value = "home_rental")
    private String homeRental;

    @TableField(value = "home_status")
    private String homeStatus;

    @TableField(value = "home_landlord")
    private String homeLandlord;

    @TableField(value = "home_tel")
    private String homeTel;

    @TableField(value = "home_type")
    private String homeType;

    @TableField(value = "home_date")
    private Date homeDate;

    @TableField(value = "home_buildingtype")
    private String homeBuildingtype;

    @TableField(value = "home_paytype")
    private String homePaytype;

    private static final long serialVersionUID = 1L;

    public static final String COL_HOME_ID = "home_id";

    public static final String COL_HOME_ADDRESS = "home_address";

    public static final String COL_HOME_MAXNUM = "home_maxnum";

    public static final String COL_HOME_INNUM = "home_innum";

    public static final String COL_HOME_RENTAL = "home_rental";

    public static final String COL_HOME_STATUS = "home_status";

    public static final String COL_HOME_LANDLORD = "home_landlord";

    public static final String COL_HOME_TEL = "home_tel";

    public static final String COL_HOME_TYPE = "home_type";

    public static final String COL_HOME_DATE = "home_date";

    public static final String COL_HOME_BUILDINGTYPE = "home_buildingtype";

    public static final String COL_HOME_PAYTYPE = "home_paytype";
}