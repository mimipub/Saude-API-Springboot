package model;

import jakarta.persistence.*;
import org.springframework.data.annotation.TypeAlias;

import java.time.LocalDateTime;

@Entity
@Table (name = "sono")
public class Sono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private LocalDateTime horasDormidas;
    @Column
    private qualidadeDoSono qualidadeDoSono;
}
