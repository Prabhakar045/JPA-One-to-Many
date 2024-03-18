package com.xworkz.MallShopMngt.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "mall")
public class MallDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mallId;
    private String mallName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mall_id")
    private List<ShopDTO> shops;
}