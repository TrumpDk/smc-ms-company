package com.ibm.fsd.smc.ms.company.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Company Entity
 * Mapping with db table `t_company`
 */
@Entity
@Table(name = "t_company")
@Getter
@Setter
@ToString
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "turnover")
    private double turnover;

    @Column(name = "ceo")
    private String ceo;

    @Column(name = "board_directors")
    private String boardDirectors;

    @Column(name = "listed_ses")
    private String listedStockExchanges;

    @Column(name = "stock_codes")
    private String stockCodes;

    @Column(name = "sector_code")
    private String sectorCode;

    @Column(name = "brief")
    private String brief;
}
