package dev.ilkerk.template.domain.repository;

import dev.ilkerk.template.domain.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface TemplateRepository extends JpaRepository<Template, Long> {
}
