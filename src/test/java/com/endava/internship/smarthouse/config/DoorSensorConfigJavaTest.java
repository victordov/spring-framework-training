package com.endava.internship.smarthouse.config;

import com.endava.internship.smarthouse.domain.sensor.Sensor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:/configs/smarthouse/sensor/security/door-sensor-context.xml")
class DoorSensorConfigJavaTest {

    @Autowired
    private Sensor doorSensor;

    @Test
    @DisplayName("Door sensor should be autowired when config Class in SecuritySensorConfig")
    void doorSensorIsPresent() {
        assertThat(doorSensor)
            .withFailMessage("Door Sensor is null")
            .isNotNull()
            .extracting("id")
            .isEqualTo("256_BOEIDMFOIT");
    }
}
