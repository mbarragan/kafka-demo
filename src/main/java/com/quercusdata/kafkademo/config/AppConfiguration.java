package com.quercusdata.kafkademo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "kafka")
public class AppConfiguration {

    private String topic;
    private String group;

    public String getTopic() {
        return topic;
    }

    public String getGroup() {
        return group;
    }

}
