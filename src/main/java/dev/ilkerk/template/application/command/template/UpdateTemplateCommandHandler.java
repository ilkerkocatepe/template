package dev.ilkerk.template.application.command.template;

import dev.ilkerk.template.application.command.ICommandHandler;
import dev.ilkerk.template.application.dto.template.TemplateResponse;
import dev.ilkerk.template.domain.entity.Template;
import dev.ilkerk.template.domain.repository.TemplateRepository;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class UpdateTemplateCommandHandler implements ICommandHandler<UpdateTemplateCommand, TemplateResponse> {
    private final TemplateRepository templateRepository;

    public UpdateTemplateCommandHandler(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @Override
    public TemplateResponse handle(UpdateTemplateCommand command) {
        // TODO: Prepare object
        Template template = templateRepository.findById(command.getTemplateUpdate().getId())
                .orElseThrow(() -> new RuntimeException("Template not found"));

        // TODO: Change fields
        template.setName(command.getTemplateUpdate().getName());
        template.setDescription(command.getTemplateUpdate().getDescription());

        // TODO: Save to DB and return
        return new TemplateResponse(templateRepository.saveAndFlush(template));
    }
}
