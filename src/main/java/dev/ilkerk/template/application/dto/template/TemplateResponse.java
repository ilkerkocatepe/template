package dev.ilkerk.template.application.dto.template;

import dev.ilkerk.template.domain.entity.Template;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TemplateResponse {
    private final Long id;
    private final String name;
    private final String description;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public TemplateResponse(Template template) {
        this.id = template.getId();
        this.name = template.getName();
        this.description = template.getDescription();
        this.createdAt = template.getCreatedAt();
        this.updatedAt = template.getUpdatedAt();
    }
}
