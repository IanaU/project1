package com.myprojects.project1.entity.condition_1.lfq;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor

public class proteins {

    private int ProteinGroup;
    private String Top;
    private String Accession;
    private double Significance;
    private double Coverage;
    private int Peptides;
    private int Unique;
    private String PTM;
    private BigDecimal wt1Area;
    private BigDecimal wt3Area;
    private BigDecimal wt2Area;
    private BigDecimal php1Area;
    private BigDecimal php3Area;
    private BigDecimal php2Area;
    private String SampleProfile;
    private BigDecimal WTArea;
    private BigDecimal PHPArea;
    private String GroupProfile;
    private int AvgMass;
    private String Description;


}
