package chao.tan.liu;

import chao.tan.liu.entity.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p></p>
 *
 * @author chaotan.liu
 * @version 1.0
 *
 * @date 2020/8/28 9:21
 */

public class test {
    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
        //加载数据源以及执行的SQL语句
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//      执行操作,底层jdbc 有三种执行方式
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//
//            UserInfo user = session.selectOne("chao.tan.liu.mapper.UserInfoMapper.selectOne",1);
//            System.out.println(user.getUser_name());
//
//            List<UserInfo> blogs = session.selectList(
//                    "chao.tan.liu.mapper.UserInfoMapper.selectList", 1);
//            System.out.println(blogs);
//        }
    }
}
