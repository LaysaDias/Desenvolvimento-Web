package br.com.api.fatec.apifatec.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 60)
	private String nome;
	
	@Column(name = "razao_social", length = 60, nullable = false)
	private String razaoSocial;
	
	@Column()
	private String endereco;
	
	@Column()
	@Email 
	private String email;
}
