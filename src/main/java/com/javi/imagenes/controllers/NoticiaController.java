package com.javi.imagenes.controllers;


import com.javi.imagenes.entity.Noticia;
import com.javi.imagenes.service.NoticiaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/noticia")
public class NoticiaController {

    private final NoticiaService noticiaService;

    public NoticiaController(NoticiaService noticiaService){
        this.noticiaService = noticiaService;
    }

    @GetMapping
    public List<Noticia> listarNoticias(){
        return noticiaService.findAllNews();
    }

    @PostMapping
    public Noticia guardarNoticia(@RequestBody Noticia noticia) throws IOException {
        return noticiaService.saveNews(noticia);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Noticia>> getNoticiaById(@PathVariable("id") Long id){
        return new ResponseEntity<Optional<Noticia>>(noticiaService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){
        if(!noticiaService.findById(id).equals(Optional.empty())){
            noticiaService.deleteById(id);
            return true;
        }
        return false;
    }

   /* @PutMapping("/{id}")
    public Noticia updateNoticia(@PathVariable("id") Long id, @RequestBody Map<String, String> body){
        Optional<Noticia> current = noticiaService.findById(id);
        current.setTecName(body.get("tecName"));
        current.setVersion(body.get("version"));
        iTechnologyService.saveTechnology(current);
        return current;
    }*/
}
