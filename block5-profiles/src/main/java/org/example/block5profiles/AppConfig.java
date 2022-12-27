package org.example.block5profiles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class AppConfig {
    @Value("${perfil.active}") private String name;
    @Value("${bd.url}") private String bdurl;
}
