package chao.tan.liu.service;


import chao.tan.liu.entity.UserInfo;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
public interface IUserService {
    /**
     * 根据userId获取用户
     * @param userId
     * @return
     */
    UserInfo getUserInfoByUserId(Integer userId);


    UserInfo getUserInfoBySpringMybatis(Integer userId);
}
