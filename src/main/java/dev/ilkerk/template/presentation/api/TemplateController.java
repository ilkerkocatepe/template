package dev.ilkerk.template.presentation.api;

import dev.ilkerk.template.application.command.template.*;
import dev.ilkerk.template.application.dto.template.*;
import dev.ilkerk.template.application.query.template.GetTemplateQuery;
import dev.ilkerk.template.application.query.template.GetTemplateQueryHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("template")
@RequiredArgsConstructor
public class TemplateController {
    private final GetTemplateQueryHandler getTemplateQueryHandler;
    private final CreateTemplateCommandHandler createTemplateCommandHandler;
    private final UpdateTemplateCommandHandler updateTemplateCommandHandler;
    private final DeleteTemplateCommandHandler deleteTemplateCommandHandler;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<TemplateResponse> getAll(@ModelAttribute TemplateFind templateFind) {
        Pageable pageable = PageRequest.of(templateFind.getPageNumber(), templateFind.getPageSize());
        return this.getTemplateQueryHandler.handle(GetTemplateQuery.builder().templateFind(templateFind).pageable(pageable).build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TemplateResponse create(@RequestBody TemplateCreate templateCreate) {
        return this.createTemplateCommandHandler.handle(CreateTemplateCommand.builder().templateCreate(templateCreate).build());
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public TemplateResponse update(@RequestBody TemplateUpdate templateUpdate) {
        return this.updateTemplateCommandHandler.handle(UpdateTemplateCommand.builder().templateUpdate(templateUpdate).build());
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestParam Long id) {
        this.deleteTemplateCommandHandler.handle(DeleteTemplateCommand.builder().templateDelete(TemplateDelete.builder().id(id).build()).build());
    }
}
