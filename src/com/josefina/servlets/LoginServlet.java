package com.josefina.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import com.josefina.dao.LoginDaoImpl;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Llega al DoPost");

        String email = req.getParameter("email");
        String password = req.getParameter("password");


        //si el formulario falla
        if (email.isEmpty() || password.isEmpty())
        {
            req.setAttribute("error", "Usuario y password no pueden ir vacíos");
            RequestDispatcher rs = req.getRequestDispatcher("/login.jsp");
            rs.forward(req, resp);
        }
        else
        {
            //si el formulario pasa la validación

            //creamos la instancia de LoginDaoImp
            LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
            System.out.println("Llega al login");
            //por defecto el resultado del login es false
            boolean res = false;
            try
            {
                res = loginDaoImpl.authenticate(email, password);

                if(res)
                {
                    System.out.println("Login correcto");
                }
                else
                {
                    System.out.println("Login incorrecto");
                }
            }
            catch (Exception ex)
            {
                //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


}