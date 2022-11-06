package io.github.yesminmarie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A COFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

//    @Bean(name = "applicationName")
//    public String applicationName(){
//
//        return "Sistema de Vendas";
//    }
}
