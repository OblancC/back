package app.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Log {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idLog;
	private String timestamp;
	private String nome;
	private String metodo;
	private String conteudo;
	private String categoria;
}
