package dev.ilkerk.template.domain.exception;

public class TemplateNotFoundException extends Exception {

    public TemplateNotFoundException() {
        super("Template not found!!");
    }
}
