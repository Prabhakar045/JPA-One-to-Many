package com.xworkz.MallShopMngt.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shop")
public class ShopDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;
    private String shopName;

//    @ManyToOne
//    @JoinColumn(name = "mall_id")
//    private MallDTO mall;
}