package com.dev.cadastro_pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//A anotation SpringBootApplication é a mistura de outras 3 anotações do ecossistema Spring:
// EnableAutoConfiguration (permite a configuração automática), ComponentScan (permite que
// o componente escaneei o pacote onde a aplicação se localiza) e Configuration (permite o registro de beans e demais configurações).
@SpringBootApplication
public class CadastroPetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroPetsApplication.class, args);
	}

}
