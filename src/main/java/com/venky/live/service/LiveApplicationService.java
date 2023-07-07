package com.venky.live.service;

import com.venky.live.persistence.entity.ShopsDetails;

public interface LiveApplicationService {

    public ShopsDetails getShopDetails(Long shopId,String shopName);
}
