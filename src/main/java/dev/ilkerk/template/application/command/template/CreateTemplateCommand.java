package dev.ilkerk.template.application.command.template;

import dev.ilkerk.template.application.command.ICommand;
import dev.ilkerk.template.application.dto.template.TemplateCreate;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CreateTemplateCommand implements ICommand, Serializable {
    private TemplateCreate templateCreate;
}
