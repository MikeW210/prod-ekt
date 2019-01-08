package pl.dmcs.projektkompetencyjny.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.dmcs.projektkompetencyjny.domain.repository.KnightRepository;
import pl.dmcs.projektkompetencyjny.domain.Knight;
import pl.dmcs.projektkompetencyjny.domain.Quest;

@Configuration
//@ImportResource("classpath:config/knightRepository-config.xml")
@PropertySource("classpath:kni.properties")
public class MainConfig {


    }
