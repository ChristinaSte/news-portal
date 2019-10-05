package com.stetsko.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString(exclude = "contents", callSuper = true)
@EqualsAndHashCode(exclude = "contents", callSuper = true)
@NoArgsConstructor
@Entity
@DiscriminatorValue("EDITOR")
public class Editor extends User {

    @Column(name = "additional_info")
    private String additionalInfo;

    @OneToMany(mappedBy = "createBy")
    private Set<Content> contents = new HashSet<>();

    public void addContent(Content content) {
        content.setCreatedBy(this);
        contents.add(content);
    }
}
