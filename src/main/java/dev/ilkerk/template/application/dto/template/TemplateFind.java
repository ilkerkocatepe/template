package dev.ilkerk.template.application.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateFind {
    Long id;
    String name;
    String description;
    int pageNumber = 0;
    int pageSize = 20;
}
