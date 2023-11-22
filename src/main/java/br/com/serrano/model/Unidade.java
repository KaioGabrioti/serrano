package br.com.serrano.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_unidades")
@Entity
public class Unidade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "criado_em")
    private String criadoEm;
    @Column(name = "qt_membros")
    private String quantidadeMembros;
    @Column(name = "genero")
    private String genero;
    @Column(name = "image")
    private String image;
}
