package com.csw.controller;

import com.csw.dao.AugOrderMapper;
import com.csw.entity.AugOrder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class WuliuController {

    @Autowired
    private AugOrderMapper augOrderMapper;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String text(@RequestParam(defaultValue = "1")int page, Model model){
        PageHelper.startPage(page,2);
        List<AugOrder> augOrders = augOrderMapper.selectAll();
        model.addAttribute("augOrders",augOrders);
        model.addAttribute("pageInfo",new PageInfo<>(augOrders));
        return "index";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String create(AugOrder augOrder){
        augOrderMapper.insert(augOrder);
        return "redirect:/";
    }

    @RequestMapping(value="/del/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id){
        augOrderMapper.deleteByPrimaryKey(id);
        return "redirect:/";
    }


}
