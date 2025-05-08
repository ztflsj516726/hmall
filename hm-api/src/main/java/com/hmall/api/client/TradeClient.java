package com.hmall.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * ClassName:TradeClient
 * Package:IntelliJ IDEA
 * Description:
 *
 * @Author ztf
 * @Create 2025/5/8-15:08
 * @Version 1.0
 */
@FeignClient("trade-service")
public interface TradeClient {

    @PutMapping("/orders/{orderId}")
    public void markOrderPaySuccess(@PathVariable("orderId") Long orderId);
}
