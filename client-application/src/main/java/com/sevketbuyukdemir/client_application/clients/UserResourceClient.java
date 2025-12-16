package com.sevketbuyukdemir.client_application.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "user-resource", url = "${resource.server.url:http://localhost:3001}")
public interface UserResourceClient {
    @GetMapping("/user-resources/first-resource")
    String getSecureData();
}