package com.javi.imagenes.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImagenService {
    public String uploadImageToFileSystem(MultipartFile file) throws IOException;

    public byte[] downloadImageFromFileSystem(String fileName) throws IOException;

}
