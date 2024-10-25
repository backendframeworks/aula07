package com.backend.aula07.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record ProductDto(@NotBlank String name, @NotNull @CPF double value) {}