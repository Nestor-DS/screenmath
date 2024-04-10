package com.nesProject.screenmatch.models;

public class Serie extends Title{
    int seasons;
    int episodesSeason;
    int minutesEpisode;

    @Override
    public int getDurationMin(){
        return  seasons * episodesSeason * minutesEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons){
        this.seasons = seasons;
    }
    public int getEpisodesSeason(){
        return episodesSeason;
    }
    public void setEpisodesSeason(int episodesSeason){
        this.episodesSeason = episodesSeason;
    }
    public int getMinutesEpisode(){
        return minutesEpisode;
    }
    public void setMinutesEpisode(int minutesEpisode){
        this.minutesEpisode = minutesEpisode;
    }
}