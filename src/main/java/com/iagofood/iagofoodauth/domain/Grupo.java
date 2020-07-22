package com.iagofood.iagofoodauth.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "grupo_permissao",
            joinColumns = @JoinColumn(
                    name = "grupo_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "permissao_id"
            )
    )
    private Set<Permissao> permissoes;
 }
