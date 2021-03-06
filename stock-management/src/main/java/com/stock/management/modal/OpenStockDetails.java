package com.stock.management.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

//----- Sahan Part -----
@Entity
public class OpenStockDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    
    @NotNull(message = "valid item information")
    @Min(value = 1 ,message="valid item information")
    Integer itemId;

    @NotNull(message = "quantity")
    @Min(value = 0 ,message="valid quantity")
    Integer quantity;

    @ManyToOne
    @JoinColumn(name = "OSid")
    @JsonIgnore
    OpenStock openStock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OpenStock getOpenStock() {
        return openStock;
    }

    public void setOpenStock(OpenStock openStock) {
        this.openStock = openStock;
    }
}
