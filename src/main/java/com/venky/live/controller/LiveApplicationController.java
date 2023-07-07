package com.venky.live.controller;

import com.venky.live.persistence.entity.ShopsDetails;
import com.venky.live.service.LiveApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/live")
public class LiveApplicationController {
    @Autowired
    private LiveApplicationService liveApplicationService;
    @GetMapping(value = "/shop-details")
    public ShopsDetails getShopDetails(@RequestParam(value = "shopId",required = true) Long shopId, @RequestParam(value = "shopName",required = true) String shopName){
        return liveApplicationService.getShopDetails(shopId,shopName);

    }
}
