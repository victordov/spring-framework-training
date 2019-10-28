package com.endava.internship.s_13_beanoverview.domain;

public class PlayerService implements MusicService {

    private String source;

    public PlayerService() {
        source = "iPod";
    }

    public PlayerService(String source) {
        this.source = source;
    }

    @Override
    public void play() {
        System.out.println("playing a song from " + source);
    }

    public static PlayerService createPlayerService() {
        return new PlayerService("radio");
    }
}
