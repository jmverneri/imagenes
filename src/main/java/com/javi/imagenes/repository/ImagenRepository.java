package com.javi.imagenes.repository;

import com.javi.imagenes.entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {
    Optional<Imagen> findByNombre(String fileName);

}
