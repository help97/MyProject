package com.tedu.controller;

import com.tedu.dao.AccDao;
import com.tedu.pojo.Acc;
import com.tedu.service.impl.AccServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccController {
    @Autowired
    AccServiceImpl accServiceImpl;

    @RequestMapping("doAll")
    public String doAll(Model model) {
        List<Acc> list = accServiceImpl.findAll();
        model.addAttribute("list", list);
        return "acc";
    }
}
