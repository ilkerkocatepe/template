package dev.ilkerk.template.domain.entity;

import jakarta.persistence.Entity;

@Entity
public class Template extends AbstractEntity<Long> {
    private String name;
    private String description;

    public Template() {
    }

    public Template(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Template(Long id, String name, String description) {
        this.setId(id);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
