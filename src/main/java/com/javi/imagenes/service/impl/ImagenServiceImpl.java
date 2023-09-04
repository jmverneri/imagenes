package com.javi.imagenes.service.impl;

import com.javi.imagenes.entity.Imagen;
import com.javi.imagenes.repository.ImagenRepository;
import com.javi.imagenes.service.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

@Service
public class ImagenServiceImpl implements ImagenService {

    @Autowired
    private ImagenRepository imagenRepository;

    private final String FOLDER_PATH= "C:\\Users\\Javi\\Desktop\\demo\\src\\main\\resources\\static\\";

    @Override
    public String uploadImageToFileSystem(MultipartFile file) throws IOException {
        String filePath = FOLDER_PATH + file.getOriginalFilename();

        Imagen imagen = imagenRepository.save(Imagen.builder()
                .nombre(file.getOriginalFilename())
                .tipo(file.getContentType())
                .path(filePath).build());

        file.transferTo(new File(filePath));

        if (imagen != null)
            return "imagen cargada satisfactoriamente : " + filePath;
        return null;
    }

    @Override
    public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
        Optional<Imagen> imagen = imagenRepository.findByNombre(fileName);
        String filePath = imagen.get().getPath();
        byte[] images = Files.readAllBytes(new File(filePath).toPath());
        return images;
    }
}
