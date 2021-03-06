package frank.dao;

import frank.exception.SystemException;
import frank.model.Classes;
import frank.model.User;
import frank.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wgsstart
 * @creat 2021-03-14 18:08
 */
public class UserDAO {
    public static User query(User user){
    User queryUser = null;
    Connection c = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
        try {
        c = DBUtil.getConnection();
        String sql = "select id,username,password,nickname from user where username= ?AND password =?";
        ps = c.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        rs = ps.executeQuery();
        while (rs.next()){
            queryUser = user;
            queryUser.setNickname(rs.getString("nickname"));
        }
    }catch (Exception e){
        throw new SystemException("00007","用户登录校验数据库查询出错",e);
    }finally{
        DBUtil.close(c,ps,rs);
    }

        return queryUser;
   }
}
