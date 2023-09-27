package br.com.serrano.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_inventario")
@Entity
public class Inventario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dt_criado_em")
    private String criadoEm;
    @Column(name = "dt_atualizado_em")
    private String atualizadoEm;
    @Column(name = "image")
    private String image;
    @Column(name = "qt_items")
    private String quantidadeItems;
}
