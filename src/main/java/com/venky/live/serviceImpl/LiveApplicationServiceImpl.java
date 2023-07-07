package com.venky.live.serviceImpl;

import com.venky.live.persistence.entity.ShopsDetails;
import com.venky.live.persistence.repository.ShopsDetailsRepository;
import com.venky.live.service.LiveApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LiveApplicationServiceImpl implements LiveApplicationService {
    @Autowired
    private ShopsDetailsRepository shopsDetailsRepository;

    @Override
    public ShopsDetails getShopDetails(Long shopId,String shopName){
       ShopsDetails shopsDetails = shopsDetailsRepository.findByShopNoAndShopName(shopId,shopName);

        return shopsDetails;
    }
}
