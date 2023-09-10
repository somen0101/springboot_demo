package com.example.demo.viewmodel;

public class TopViewModel {

    private String teamName = "阪神タイガース";

    private int nowLeagueRank = 1;

    public String getTeamName() {
        return teamName;
    }

    public int getNowLeagueRank() {
        return nowLeagueRank;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setNowLeagueRank(int nowLeagueRank) {
        this.nowLeagueRank = nowLeagueRank;
    }
}
