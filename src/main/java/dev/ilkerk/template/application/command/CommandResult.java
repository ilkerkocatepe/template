package dev.ilkerk.template.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommandResult {
    private Boolean success;
    private String message;
}
