package com.example.shoppingdataprovider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huhaiyang
 * @date 2021/9/6
 */
@Data
@NoArgsConstructor
public class UserLog {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String userId;
    private String itemId;
    private String cat_id;
    private String merchantId;
    private String brandId;
    private String month;
    private String day;
    private String action;
    private String ageRange;
    private String gender;
    private String province;
}
