package jpabook.shop.dao;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SkuOptionValueId implements Serializable {
    private Long skuId;
    private Long optionValueId;
}
