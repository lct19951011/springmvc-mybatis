package chao.tan.liu.mapper;


import chao.tan.liu.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
@Repository
public interface UserInfoNoImplMapper {
    /**
     * 根据ID获取单个对象
     * @param userId
     * @return
     */
    UserInfo selectOne(@Param("userId") Integer userId);
}
