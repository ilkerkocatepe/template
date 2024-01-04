package dev.ilkerk.template.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@Configuration
public class LocalizationConfiguration {
    @Value("${spring.messages.locale}")
    private Locale DEFAULT_LOCALE;

    @Bean
    public ResourceBundleMessageSource messageSource() {
        Locale.setDefault(DEFAULT_LOCALE);
        final ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("i18n/messages");
        source.setDefaultEncoding("UTF-8");
        return source;
    }
}
