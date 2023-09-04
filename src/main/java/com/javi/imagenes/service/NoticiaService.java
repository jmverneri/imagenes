package com.javi.imagenes.service;

import com.javi.imagenes.entity.Noticia;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface NoticiaService {
    public List<Noticia> findAllNews();

    public Optional<Noticia> findById(Long id);

    public Noticia saveNews(Noticia noticia);

    public void deleteById(Long id);
}
