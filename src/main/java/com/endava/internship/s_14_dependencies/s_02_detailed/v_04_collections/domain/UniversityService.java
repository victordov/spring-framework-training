package com.endava.internship.s_14_dependencies.s_02_detailed.v_04_collections.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UniversityService {

    private Map<String, Object> teachers;
    private List<Object> campusAddress;

    //contains string values and beans
    private Set<Object> otherData;
    private Properties otherProperties;

    public void setTeachers(Map<String, Object> teachers) {
        this.teachers = teachers;
    }

    public void setCampusAddress(List<Object> campusAddress) {
        this.campusAddress = campusAddress;
    }

    public void setOtherData(Set<Object> otherData) {
        this.otherData = otherData;
    }

    public void setOtherProperties(Properties otherProperties) {
        this.otherProperties = otherProperties;
    }

    @Override
    public String toString() {
        return "UniversityService{" +
            "teachers=" + teachers +
            ", campusAddress=" + campusAddress +
            ", otherData=" + otherData +
            ", otherProperties=" + otherProperties +
            '}';
    }
}
