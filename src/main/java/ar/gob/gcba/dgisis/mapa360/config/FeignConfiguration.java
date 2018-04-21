package ar.gob.gcba.dgisis.mapa360.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ar.gob.gcba.dgisis.mapa360")
public class FeignConfiguration {

}
