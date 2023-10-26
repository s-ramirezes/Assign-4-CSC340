package com.CSC340SRE.crudAPP;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "game")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String sku;
    private double price;

}
