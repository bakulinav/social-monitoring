package net.bakulin.socialmonitor.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class LinkedinConf {

    public static final Logger log = LoggerFactory.getLogger(LinkedinConf.class);

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public String linkedinClient(@Value("${linkedin-clientid}") String clientId,
                        @Value("${linkedin-secret}") String secret) {

        log.info("Init app with linkedin-clientid="+clientId);
        log.info("Init app with linkedin-secret="+secret);

        return "hello";
    }
}
