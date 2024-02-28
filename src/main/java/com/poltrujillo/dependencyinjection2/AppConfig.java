package com.poltrujillo.dependencyinjection2;

import com.poltrujillo.dependencyinjection2.models.Item;
import com.poltrujillo.dependencyinjection2.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {
    @Bean
    List<Item> itemsInvoice() {
        return Arrays.asList(new Item(new Product("Sony Camera", 800), 2), new Item(new Product("Bianchi Bicycle", 800), 4));
    }
}
