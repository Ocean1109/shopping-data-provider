package com.example.shoppingdataprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shoppingdataprovider.entity.AnalysisAction;
import com.example.shoppingdataprovider.entity.UserLog;
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
}
