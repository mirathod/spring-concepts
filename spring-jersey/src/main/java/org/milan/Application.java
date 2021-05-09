package org.milan;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * Application Config class
 *
 * @author Milan Rathod
 */
@Configuration
@ApplicationPath("api")
public class Application extends ResourceConfig {

    @PostConstruct
    public void init() {
        packages("org.milan");
    }

}
