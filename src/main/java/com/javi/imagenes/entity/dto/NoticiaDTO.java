package com.javi.imagenes.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticiaDTO {
    private Long id;
    private String titulo;
    private String descripcion;
    private Long imagenId; // Assuming you only need the image ID in the DTO

    public NoticiaDTO(Long id, String titulo, String descripcion, Long imagenId) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenId = imagenId;
    }
}
