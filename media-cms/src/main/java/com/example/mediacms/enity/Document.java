package com.example.mediacms.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Document extends Media{

    private String format; // pdf, word etc
    private Integer pageCount;

}
