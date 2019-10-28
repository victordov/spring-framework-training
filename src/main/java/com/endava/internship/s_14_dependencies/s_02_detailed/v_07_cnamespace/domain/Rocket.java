package com.endava.internship.s_14_dependencies.s_02_detailed.v_07_cnamespace.domain;

public class Rocket {

    private final PropulsionSystem propulsion;
    private final GuidanceSystem guidance;
    private final String name;

    public Rocket(PropulsionSystem propulsion, GuidanceSystem guidance, String name) {
        this.propulsion = propulsion;
        this.guidance = guidance;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rocket{" +
            "propulsion=" + propulsion +
            ", guidance=" + guidance +
            ", name='" + name + '\'' +
            '}';
    }
}
