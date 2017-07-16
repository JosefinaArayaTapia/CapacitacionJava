package com.josefina.utils;

import java.sql.*;

public class DbConnection 
{
    private Connection con = null;
    private String bd = "javacrud";
    private String login = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3306/";
    private String dsn = url + bd;
    
    public DbConnection()
    {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dsn, login, pass);
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println("Error conectando con la bd: " + e.getMessage());
        }
    }
    
    public Connection getConnection()
    {
        return con;
    }
}