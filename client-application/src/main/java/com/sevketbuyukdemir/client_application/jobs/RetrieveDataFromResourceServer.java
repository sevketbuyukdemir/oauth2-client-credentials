package com.sevketbuyukdemir.client_application.jobs;

import com.sevketbuyukdemir.client_application.clients.AdminResourceClient;
import com.sevketbuyukdemir.client_application.clients.UserResourceClient;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class RetrieveDataFromResourceServer {
    private final Logger logger = LogManager.getLogger(RetrieveDataFromResourceServer.class);

    private final UserResourceClient userResource;
    private final AdminResourceClient adminResource;

    @Scheduled(fixedRate = 5000)
    public void retrieveData() {
        try {
            logger.info("User Resource Response: {}", userResource.getSecureData());
        } catch (FeignException e) {
            logger.info(e.getMessage());
        }
        try {
            logger.info("Admin Resource Response: {}", adminResource.getSecureData());
        } catch (FeignException e) {
            logger.info(e.getMessage());
        }
    }

}
