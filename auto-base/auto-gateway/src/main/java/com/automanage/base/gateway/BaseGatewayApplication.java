

package com.automanage.base.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关中心
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BaseGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseGatewayApplication.class, args);
	}
}
