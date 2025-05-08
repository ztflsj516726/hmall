package com.hmall.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName:UserClient
 * Package:IntelliJ IDEA
 * Description:
 *
 * @Author ztf
 * @Create 2025/5/8-15:08
 * @Version 1.0
 */
@FeignClient("user-service")
public interface UserClient {
    @PutMapping("/users/money/deduct")
    void deductMoney(@RequestParam("pw") String pw, @RequestParam("amount") Integer amount);
}
