package it.cast.test;

import it.cast.dao.AccountDao;
import it.cast.domain.Account;
import it.cast.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run() throws Exception{
        //加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //查询所有信息
        List<Account> lists = accountDao.findAll();
        for (Account list:lists) {
            System.out.println(list);
        }
        //关闭资源
        sqlSession.close();
        in.close();

    }

    public void testSaveAccount() throws Exception{
        Account account = new Account();
        account.setName("zhoudongyu2");
        account.setMoney(1000d);

        //加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //保存
        accountDao.saveAccount(account);

        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
        in.close();
    }

}
