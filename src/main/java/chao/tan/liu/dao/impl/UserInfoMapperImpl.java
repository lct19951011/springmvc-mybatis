package chao.tan.liu.dao.impl;

import chao.tan.liu.dao.UserInfoMapper;
import chao.tan.liu.entity.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.activation.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * <p></p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/8/27 11:22
 */
@Repository
public class UserInfoMapperImpl implements UserInfoMapper {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserInfoMapperImpl.class);

    private SqlSessionFactory factory;
    //覆盖掉默认构造函数,这样就有了工厂，可以进一步创建对象
    public UserInfoMapperImpl(SqlSessionFactory factory){
        this.factory = factory;
    }
    public UserInfoMapperImpl() {

    }

    @Override
    public UserInfo selectOne(Integer userId)  {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();


        UserInfo user = session.selectOne("chao.tan.liu.mapper.UserInfoMapper.selectOne", 1);
        System.out.println(user.getUserName());

        List<UserInfo> blogs = session.selectList(
                "chao.tan.liu.mapper.UserInfoMapper.selectList", 1);
        System.out.println(blogs);

        //使用完后关闭掉
        session.close();
        return user;
    }
}
