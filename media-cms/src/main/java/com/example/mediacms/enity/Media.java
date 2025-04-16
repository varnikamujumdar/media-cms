package com.example.mediacms.enity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
abstract public class Media extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String contentType;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private Long size;

    // multiple medias can be owned by a single user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

    @ManyToMany
    @JoinTable(
            name = "media_tags",
            joinColumns = @JoinColumn(name = "media_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
