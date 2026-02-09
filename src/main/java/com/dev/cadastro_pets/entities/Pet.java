package com.dev.cadastro_pets.entities;

import jakarta.persistence.*;
import lombok.*;

//Aqui defino a criação de tabelas/entidades. Incluindo o nome da tabela e colunas (útil para conectar no SQL)

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pets")
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="age")
    private Integer age;

    @Column(name = "species")
    private String species;

    @Column(name="breed")
    private String breed;
}
