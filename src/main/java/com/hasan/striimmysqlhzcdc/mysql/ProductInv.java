package com.hasan.striimmysqlhzcdc.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "composite_product_inv")
@IdClass(ProductKey.class)
public class ProductInv implements Serializable {

    @Id
    public Long sku = 0L;

    @Id
    public String skuHash = null;


    public double stock = 0;
    public String name = null;
    public Date lastUpdated = null;

    public ProductInv() {
    }

    public ProductInv(Long sku, String skuHash, double stock, String name, Date lastUpdated) {
        this.sku = sku;
        this.skuHash = skuHash;
        this.stock = stock;
        this.name = name;
        this.lastUpdated = lastUpdated;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getSkuHash() {
        return skuHash;
    }

    public void setSkuHash(String skuHash) {
        this.skuHash = skuHash;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    @Override
    public String toString() {
        return "ProductInv{" +
                "sku=" + sku +
                ", skuHash=" + skuHash +
                ", stock=" + stock +
                ", name='" + name + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}