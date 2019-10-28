package com.endava.internship.smarthouse.domain.hub;

public class MiHub implements Hub {

    @Override
    public boolean isActive() {
        return true;
    }

    private LocatorService locator;

    static class LocatorService {

        public Service locate(String id) {
            throw new RuntimeException("Not implemented");
        }
    }

}
