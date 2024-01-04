package dev.ilkerk.template.application.query.template;

import dev.ilkerk.template.application.converter.FindByExample;
import dev.ilkerk.template.application.query.IQueryHandler;
import dev.ilkerk.template.application.dto.template.TemplateResponse;
import dev.ilkerk.template.domain.entity.Template;
import dev.ilkerk.template.domain.repository.TemplateRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class GetTemplateQueryHandler implements IQueryHandler<GetTemplateQuery, Page<TemplateResponse>> {
    private final TemplateRepository templateRepository;
    private final FindByExample findByExample;

    public GetTemplateQueryHandler(TemplateRepository templateRepository, FindByExample findByExample) {
        this.templateRepository = templateRepository;
        this.findByExample = findByExample;
    }

    @Override
    public Page<TemplateResponse> handle(GetTemplateQuery query) {
        Example<Template> example = findByExample.toExample(query.getTemplateFind());
        return templateRepository.findAll(example, query.getPageable()).map(TemplateResponse::new);
    }
}
