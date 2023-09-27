package br.com.serrano.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_eventos")
@Entity
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dt_criado_em")
    private String criadoEm;
    @Column(name = "dt_iniciado_em")
    private String iniciadoEm;
    @Column(name = "dt_finalizado_em")
    private String finalizadoEm;
    @Column(name = "qt_participantes")
    private String quantidadeParticipantes;
}
