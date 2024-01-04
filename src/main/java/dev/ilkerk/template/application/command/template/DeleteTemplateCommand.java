package dev.ilkerk.template.application.command.template;

import dev.ilkerk.template.application.command.ICommand;
import dev.ilkerk.template.application.dto.template.TemplateDelete;
import dev.ilkerk.template.application.dto.template.TemplateUpdate;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class DeleteTemplateCommand implements ICommand, Serializable {
    private TemplateDelete templateDelete;
}
