package com.example.mediacms.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Tag extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    private boolean auto = false;

    @ManyToMany(mappedBy = "tags")
    private Set<Media> media = new HashSet<>();

}
