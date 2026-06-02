package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Users;

public class UsersDAO extends DAO {

    public Users search(String memberId, String password)
            throws Exception {
    	

        Users user = null;

        Connection con = getConnection();

        PreparedStatement st = con.prepareStatement(
            "select * from users where MEMBER_ID=? and PASSWORD=?"
        );

        st.setString(1, memberId);
        st.setString(2, password);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {

            user = new Users();

            user.setMemberId(rs.getString("MEMBER_ID"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setLastName(rs.getString("LAST_NAME"));
            user.setFirstName(rs.getString("FIRST_NAME"));
            user.setAddress(rs.getString("ADDRESS"));
            user.setMailAddress(rs.getString("MAIL_ADDRESS"));
        }

        st.close();
        con.close();

        return user;
    }
    
    public int insert(Users user) throws Exception {

        Connection con = getConnection();

        PreparedStatement st = con.prepareStatement(
            "INSERT INTO users(MEMBER_ID, PASSWORD, LAST_NAME, FIRST_NAME, ADDRESS, MAIL_ADDRESS) VALUES(?,?,?,?,?,?)"
        );

        st.setString(1, user.getMemberId());
        st.setString(2, user.getPassword());
        st.setString(3, user.getLastName());
        st.setString(4, user.getFirstName());
        st.setString(5, user.getAddress());
        st.setString(6, user.getMailAddress());

        int result = st.executeUpdate();

        st.close();
        con.close();

        return result;
    }
}