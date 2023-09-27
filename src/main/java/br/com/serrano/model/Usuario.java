package br.com.serrano.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuarios")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "active")
    private boolean ativo;
    @Column(name = "dt_last_access")
    private String ultimoAcessoEm;
    @Column(name = "is_diretoria")
    private boolean isDiretoria;
    @Column(name = "is_desbravador")
    private boolean isDesbravador;

}
