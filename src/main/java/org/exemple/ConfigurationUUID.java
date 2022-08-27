package org.exemple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationUUID {
    @Bean
    public UuidService uuidService() {
        return new UuidService();
    }
}
