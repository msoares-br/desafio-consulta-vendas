package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.projections.SaleSummaryProjection;

public class SaleSummaryDTO {

    private String name;
    private Double summary;

    public SaleSummaryDTO() {
    }

    public SaleSummaryDTO(String name, Double summary) {
        this.name = name;
        this.summary = summary;
    }

    public SaleSummaryDTO(SaleSummaryProjection projection) {
        name = projection.getName();
        summary = projection.getSummary();
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
}
