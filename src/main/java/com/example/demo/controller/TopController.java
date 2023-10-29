package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.viewmodel.TopViewModel;

@Controller
@EnableAutoConfiguration
public class TopController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    TopViewModel topViewModel = new TopViewModel();
    @RequestMapping(value="/")
    public String top(Model model){
        //DB接続後にSQL実行
        List<Map<String,Object>> list;
        list = jdbcTemplate.queryForList("select * from m_team");
        System.out.println(list.toString());
        model.addAttribute("teamName",topViewModel.getTeamName());
        model.addAttribute("currentRank",topViewModel.getCurrentLeagueRank());
        return "top";
    }
}
