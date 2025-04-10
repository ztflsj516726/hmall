package com.hmall.api.client;

import com.hmall.api.dto.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

/**
 * ClassName:ItemClient
 * Package:IntelliJ IDEA
 * Description:
 *
 * @Author ztf
 * @Create 2025/4/10-16:27
 * @Version 1.0
 */
@FeignClient("item-service")
public interface ItemClient {
    @GetMapping("/items")
    List<ItemDTO> queryItemsByIds(@RequestParam("ids") Set<Long> ids);
}
