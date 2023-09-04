package com.javi.imagenes.service.impl;

import com.javi.imagenes.entity.Noticia;
import com.javi.imagenes.repository.NoticiaRepository;
import com.javi.imagenes.service.ImagenService;
import com.javi.imagenes.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServiceImpl implements NoticiaService {
    @Autowired
    private NoticiaRepository noticiaRepository;
    @Autowired
    private ImagenService imagenService;

    @Override
    public List<Noticia> findAllNews() {
        return noticiaRepository.findAll();
    }

    @Override
    public Optional<Noticia> findById(Long id) {
        Optional<Noticia> noticiaPorId = noticiaRepository.findById(id);
        return noticiaPorId;
    }


    public Noticia saveNews(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    @Override
    public void deleteById(Long id) {
        noticiaRepository.deleteById(id);
    }
}
