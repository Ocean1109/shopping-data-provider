package com.example.shoppingdataprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shoppingdataprovider.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huhaiyang
 * @date 2021/9/6
 */
@Mapper
@Repository
public interface UserLogMapper extends BaseMapper<UserLog> {
    @Select("select action,count(*) from user_log group by action")
    List<AnalysisAction> getAnalysisAction();

    @Select("select gender,count(*) from user_log group by gender")
    List<CompareNum> getCompareNum();

    @Select("select gender,age_range,count(*) from user_log group by gender,age_range")
    List<CompareAge> getCompareAge();

    @Select("select cat_id,count(*) from user_log group by cat_id order by count(*) desc limit 5")
    List<TopProductCategory> getTopProductCategory();

    @Select("select province,count(*) from user_log group by province order by count(*) desc")
    List<CompareProvince> getCompareProvince();
}
