package com.josefina.dao;

import com.josefina.utils.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoImpl implements LoginDao 
{
    @Override
    public boolean authenticate(String email, String password) throws Exception 
    {
        DbConnection con = new DbConnection();
        System.out.println("Llega al Conecion");
        PreparedStatement ps = con.getConnection().prepareStatement(
            "SELECT * FROM users WHERE email = ? AND password = ?"
        );
        ps.setString(1, email);
        ps.setString(2, password);
        ResultSet rs =ps.executeQuery();
        return rs.next();
    }
}