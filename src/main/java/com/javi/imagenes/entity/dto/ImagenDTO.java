package com.javi.imagenes.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ImagenDTO {
    private Long id;
    private String nombre;
    private String tipo;
    private byte[] contenido;

    public ImagenDTO(Long id, String nombre, String tipo, byte[] contenido) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.contenido = contenido;
    }
}
