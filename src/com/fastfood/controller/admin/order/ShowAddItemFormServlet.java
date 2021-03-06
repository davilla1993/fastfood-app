package com.fastfood.controller.admin.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fastfood.services.OrderServices;


@WebServlet("/admin/add_item_form")
public class ShowAddItemFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ShowAddItemFormServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServices orderServices = new OrderServices(request, response);
		orderServices.showAddItemForm();
	}

}
