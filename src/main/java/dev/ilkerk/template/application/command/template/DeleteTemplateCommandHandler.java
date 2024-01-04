package dev.ilkerk.template.application.command.template;

import dev.ilkerk.template.application.command.ICommandHandler;
import dev.ilkerk.template.application.dto.template.TemplateResponse;
import dev.ilkerk.template.domain.entity.Template;
import dev.ilkerk.template.domain.repository.TemplateRepository;
import org.springframework.stereotype.Component;

@Component
public class DeleteTemplateCommandHandler implements ICommandHandler<DeleteTemplateCommand, Void> {
    private final TemplateRepository templateRepository;

    public DeleteTemplateCommandHandler(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @Override
    public Void handle(DeleteTemplateCommand command) {
        // TODO: Find record by id and delete it
        this.templateRepository.deleteById(command.getTemplateDelete().getId());

        return null;
    }
}
