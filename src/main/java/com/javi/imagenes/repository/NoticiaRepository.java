package com.javi.imagenes.repository;

import com.javi.imagenes.entity.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {

}
