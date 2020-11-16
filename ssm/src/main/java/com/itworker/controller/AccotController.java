package com.itworker.controller;

import com.itworker.domain.Accot;
import com.itworker.service.AccotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/accot")
public class AccotController {

    @Autowired
    private AccotService accotService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有的账户信息...");

        //调用service方法
        List<Accot> accots = accotService.findAll();
        model.addAttribute("list", accots);
        return "list";
    }

    @RequestMapping(value = "/restfulTest", method = RequestMethod.GET)
    public @ResponseBody List<Accot> test() {
        List<Accot> accots = accotService.findAll();
        return accots;
    }

    @RequestMapping("/save")
    public void save(Accot accot, HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*accotService.saveAccot(accot);*/
        /*response.sendRedirect(request.getContextPath()+"/accot/findAll");*/
        System.out.println(accot);
        return;
    }
}
