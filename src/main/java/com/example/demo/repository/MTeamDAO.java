package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MTeamDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void findAllItem() {
    //DB接続後にSQL実行
    List<Map<String, Object>> list;
    list =jdbcTemplate.queryForList("select * from m_team");
    System.out.println(list.get(1).get("team_id"));
    }
}
