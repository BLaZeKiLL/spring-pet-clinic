package org.blazekill.springpetclinic.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerStartupEventHandler implements ApplicationListener<WebServerInitializedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(ServerStartupEventHandler.class);

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        logger.info("Listening on http://localhost:" + event.getWebServer().getPort());
    }

}
