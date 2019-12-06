package min;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients( basePackages = {"min.server"} )
@EnableEurekaClient
@SpringBootApplication
public class ApplicantionRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicantionRun.class,args);
    }
}
