package model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "exercicio")
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private LocalDate data;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer series;
    @Column(nullable = false)
    private Integer repeticao;
    @Column(nullable = false)
    private String carga;
    @Column(nullable = false)
    private LocalDateTime tempo;
}
