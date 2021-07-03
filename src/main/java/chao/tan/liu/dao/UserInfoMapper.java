package chao.tan.liu.dao;

import chao.tan.liu.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */

public interface UserInfoMapper {
    /**
     * 根据ID获取单个对象
     * @param userId
     * @return
     */
    UserInfo selectOne(@Param("userId") Integer userId) ;
}
