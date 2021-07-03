package chao.tan.liu.service.impl;


import chao.tan.liu.dao.UserInfoMapper;
import chao.tan.liu.entity.UserInfo;
import chao.tan.liu.mapper.UserInfoNoImplMapper;
import chao.tan.liu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserInfoNoImplMapper userInfoNoImplMapper;
    @Override
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoMapper.selectOne(userId);
    }

    @Override
    public UserInfo getUserInfoBySpringMybatis(Integer userId) {
        return userInfoNoImplMapper.selectOne(userId);
    }
}
