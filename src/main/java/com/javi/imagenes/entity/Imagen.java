package com.javi.imagenes.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "imagen")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String tipo;
    private String path;
   //@OneToOne(mappedBy = "imagen")
   // private Noticia noticia;
}
