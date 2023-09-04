package com.javi.imagenes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "noticia")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    @OneToOne
    @JoinColumn(name = "id_imagen", referencedColumnName = "id")
    private Imagen imagen;
}
