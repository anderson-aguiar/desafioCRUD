package com.anderson.desafioCRUD.dto;

import java.time.LocalDate;

import com.anderson.desafioCRUD.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public class ClientDTO {

	private Long id;
	@NotBlank(message = "Campo requirido")
	private String name;
	
	private String cpf;
	@Positive(message = "Valor deve ser positivo")
	private Double income;
	
	@NotBlank(message = "Campo requerido")
	@PastOrPresent(message = "Data inferior a data atual")
	private LocalDate birthDate;
	
	private Integer children;

	public ClientDTO(Client client) {
		id = client.getId();
		name = client.getName();
		cpf = client.getCpf();
		income = client.getIncome();
		birthDate = client.getBirthDate();
		children = client.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
	
}
