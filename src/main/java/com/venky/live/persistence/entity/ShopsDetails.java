package com.venky.live.persistence.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class ShopsDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long shopNo;
    private String shopName;
    private boolean isOpened;
    private String closingTime;
    private String openTime;
}
