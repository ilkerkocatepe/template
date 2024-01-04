package dev.ilkerk.template.application.command.template;

import dev.ilkerk.template.application.command.ICommand;
import dev.ilkerk.template.application.dto.template.TemplateUpdate;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UpdateTemplateCommand implements ICommand, Serializable {
    private TemplateUpdate templateUpdate;
}
