package com.nesProject.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesSeason;
    private int minutesEpisode;

    public Series(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public int getDurationMin() {
        return seasons * episodesSeason * minutesEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesSeason() {
        return episodesSeason;
    }

    public void setEpisodesPerSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }
}
