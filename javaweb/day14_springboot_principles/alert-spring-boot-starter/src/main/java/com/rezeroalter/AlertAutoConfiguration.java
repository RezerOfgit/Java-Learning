package com.rezeroalter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Re-zero
 * @version 1.0
 */
@Configuration
@EnableConfigurationProperties(AlertProperties.class)
@ConditionalOnProperty(prefix = "alert.robot", name = "token")
public class AlertAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public AlertService alertService(AlertProperties alertProperties) {
        return new AlertService(alertProperties);
    }
}
