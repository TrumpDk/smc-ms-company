package com.ibm.fsd.smc.ms.company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroServiceCompanyApplication {

    private static Logger log = LoggerFactory.getLogger(MicroServiceCompanyApplication.class);

    public static void main(String[] args) {
        log.debug("--- begin....");
        SpringApplication.run(MicroServiceCompanyApplication.class, args);
        log.debug("--- has been startup...");
    }

}
