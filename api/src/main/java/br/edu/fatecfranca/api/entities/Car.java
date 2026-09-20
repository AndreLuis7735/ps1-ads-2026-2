package br.edu.fatecfranca.api.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(name = "model", nullable = false, unique = true)
    private String model;

    // 1. Corrigido para String
    @Column(name = "color")
    private String color;

    @Column(name = "year_manufacture", nullable = false)
    private Integer yearManufacture;

    // 2. Corrigido para Boolean
    @Column(name = "imported", nullable = false)
    private Boolean imported;

    @Column(nullable = true)
    private String plates;

    @Column(nullable = false)
    private String district;

    // 3. Corrigido para LocalDate
    @Column(name = "selling_date", nullable = false)
    private LocalDate sellingDate;

    // 4. Removido @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "selling_price", precision = 12, scale = 2)
    private BigDecimal sellingPrice;

    public Car() {
    }

    // Getters e Setters Atualizados
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(Integer yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public Boolean getImported() {
        return imported;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public LocalDate getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(LocalDate sellingDate) {
        this.sellingDate = sellingDate;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}