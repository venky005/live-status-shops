package com.venky.live.persistence.repository;

import com.venky.live.persistence.entity.ShopsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShopsDetailsRepository extends JpaRepository<ShopsDetails, Long> {
    ShopsDetails findByShopNoAndShopName(Long shopNo,String shopName);


}
