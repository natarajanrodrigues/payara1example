package br.edu.ifpb.pos.controller;

import br.edu.ifpb.pos.entity.Pessoa;
import br.edu.ifpb.pos.service.PessoaService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by natarajan on 19/10/16.
 */
public class PessoaAddController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String nomePessoa = (String) request.getParameter("nome");

        Pessoa p = new Pessoa();
        p.setName(nomePessoa);
        PessoaService ps = PessoaService.getInstance();
        ps.add(p);
        response.sendRedirect("index");

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
