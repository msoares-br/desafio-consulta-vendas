package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;

public class SaleSummaryDTO {

    private String name;
    private Double summary;

    public SaleSummaryDTO() {
    }

    public SaleSummaryDTO(String name, Double summary) {
        this.name = name;
        this.summary = summary;
    }

    public SaleSummaryDTO(Sale entity) {
        name = entity.getSeller().getName();
        summary = entity.getAmount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSummary() {
        return summary;
    }

    public void setSummary(Double summary) {

        this.summary = summary;
    }

    @Override
    public String toString() {
        return "SaleSummaryDTO{" +
                "name='" + name + '\'' +
                ", summary=" + summary +
                '}';
    }
}
