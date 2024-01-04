package dev.ilkerk.template.application.query.template;

import dev.ilkerk.template.application.query.IQuery;
import dev.ilkerk.template.application.dto.template.TemplateFind;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTemplateQuery implements IQuery {
    private TemplateFind templateFind;
    private Pageable pageable;
}
