package dev.ilkerk.template.application.converter;

import dev.ilkerk.template.application.dto.template.TemplateFind;
import dev.ilkerk.template.domain.entity.Template;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

@Component
public class FindByExample {

    public Example<Template> toExample(TemplateFind templateFind) {
        return Example.of(new Template(templateFind.getId(), templateFind.getName(), templateFind.getDescription()));
    }
}
