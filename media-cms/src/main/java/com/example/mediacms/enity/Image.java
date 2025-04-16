package com.example.mediacms.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Image extends Media{

    private Integer width;
    private Integer height;
    private String format; // PNG, JPEG, etc.
}
