package br.com.serrano.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_especialidades")
@Entity
public class Especialidade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dt_criado_em")
    private String criadoEm;
    @Column(name = "nivel")
    private String nivel;
    @Column(name = "instituicao_origem")
    private String instituicaoOrigem;
    @Column(name = "image")
    private String image;
}
