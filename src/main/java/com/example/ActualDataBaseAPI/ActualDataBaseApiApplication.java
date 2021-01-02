package com.example.ActualDataBaseAPI;
/* Esse é o arquivo principal, o "start" da aplicação
No mesmo nível deste arquivo, estão 4 packages:
1 - api
2 - dao: data access object. Serve para encapsular a fonte de dados. Se torna uma interface pra que os outros arquivos
 da aplicação se comuniquem com os dados. O dao gerencia a conexão com o data source para obter e armazenar informações.
 Assim, o data source fica desacoplado de uma base de dados específica. Dá flexibilidade para manutenção e alterações no
 código.
3 - model: pasta na qual são "modeladas" as nossas classes. Ou seja, serve para a criação dos objetos.
4 - service
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActualDataBaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActualDataBaseApiApplication.class, args);
	}

}
