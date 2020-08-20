package com.neo.controller;

import com.neo.mapper.DataStructureMapper;
import com.neo.model.datastructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description Author neo
 * Date 2020/8/19 9:31
 */
//@RestController
@Controller
public class DataStructureController {

    @Autowired
    private DataStructureMapper dataStructureMapper;



    @GetMapping("/")
    public String tree(){
        return "tree";
    }


    @GetMapping("/level1")
    public String level1(){
        return "level1";
    }


    @GetMapping("/level3")
    public String level3(){
        return "level3";
    }


    @RequestMapping("/le")
    public String  get_level1(Model model){
        List<datastructure> level1 = dataStructureMapper.getLevel1();
        model.addAttribute("list1", level1);
        return "level1";
    }

    @RequestMapping("/point")
    public String  getall(Model model){
        List<datastructure> level1 = dataStructureMapper.getLevel1();
        model.addAttribute("list", level1);
        return "point";
    }


    @RequestMapping("/le2")
    public String  getlevel2(Model model){
        List<datastructure> level2 = dataStructureMapper.level2();
        model.addAttribute("list2", level2);
        List<datastructure> level1 = dataStructureMapper.getLevel1();
        model.addAttribute("list1", level1);
        return "level2";
    }


    @RequestMapping("/le3")
    public String  getlevel3(Model model){
        List<datastructure> level3 = dataStructureMapper.level3();
        model.addAttribute("list3", level3);
        List<datastructure> level1 = dataStructureMapper.getLevel1();
        model.addAttribute("list1", level1);
        return "level3";
    }


}
