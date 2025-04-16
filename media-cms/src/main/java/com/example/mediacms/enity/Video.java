package com.example.mediacms.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Video extends Media{

    private Integer width;
    private Integer height;
    private Long duration; // in seconds
    private String format; // MP4, AVI, etc.
    private String codec;
}
