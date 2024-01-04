package dev.ilkerk.template.application.dto.template;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplateUpdate {
    Long id;
    String name;
    String description;
}
