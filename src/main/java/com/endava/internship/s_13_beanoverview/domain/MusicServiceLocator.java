package com.endava.internship.s_13_beanoverview.domain;

public class MusicServiceLocator {

    public MusicService locateOnlineMusicService() {
        return new PlayerService("online");
    }

    public MusicService locateTapeMusicService() {
        return new PlayerService("tape");
    }
}
