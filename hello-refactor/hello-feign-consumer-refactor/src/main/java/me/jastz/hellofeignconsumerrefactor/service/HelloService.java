package me.jastz.hellofeignconsumerrefactor.service;

import me.jastz.helloserviceapi.service.IHelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by zhiwen on 2017/8/22.
 */
@FeignClient("hello-service-refactor")
public interface HelloService extends IHelloService {

}
