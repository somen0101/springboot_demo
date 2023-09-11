package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.example.demo.viewmodel.TopViewModel;

@Controller
@EnableAutoConfiguration
public class TopController {

    TopViewModel topViewModel = new TopViewModel();
    @RequestMapping(value="/")
    public String top(Model model){
        model.addAttribute("teamName",topViewModel.getTeamName());
        model.addAttribute("currentRank",topViewModel.getCurrentLeagueRank());
        return "top";
    }
}
