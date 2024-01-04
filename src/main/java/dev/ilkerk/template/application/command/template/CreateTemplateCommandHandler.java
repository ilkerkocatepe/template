package dev.ilkerk.template.application.command.template;

import dev.ilkerk.template.application.command.ICommandHandler;
import dev.ilkerk.template.application.dto.template.TemplateResponse;
import dev.ilkerk.template.domain.entity.Template;
import dev.ilkerk.template.domain.repository.TemplateRepository;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class CreateTemplateCommandHandler implements ICommandHandler<CreateTemplateCommand, TemplateResponse> {
    private final TemplateRepository templateRepository;

    public CreateTemplateCommandHandler(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @Override
    public TemplateResponse handle(CreateTemplateCommand command) {
        // TODO: Prepare object
        Template template = new Template(command.getTemplateCreate().getName(), command.getTemplateCreate().getDescription());

        // TODO: Save to DB and return
        return new TemplateResponse(templateRepository.saveAndFlush(template));
    }
}
