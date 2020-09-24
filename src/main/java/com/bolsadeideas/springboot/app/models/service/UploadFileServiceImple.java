package com.bolsadeideas.springboot.app.models.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileServiceImple implements IUploadFileService {

	private final Logger log = LoggerFactory.getLogger(getClass());
	private final static String UPLOAD_PATH = "uploads";

	@Override
	public Resource load(String fileName) throws MalformedURLException {
		Path pathFoto = this.pathFoto(fileName);
		log.info("Path foto: " + pathFoto);

		Resource resource = null;

		resource = new UrlResource(pathFoto.toUri());
		if (!resource.exists() || !resource.isReadable()) {
			throw new RuntimeException("Error: No se puede cargar la imagen " + pathFoto.toString());
		}
		return resource;
	}

	@Override
	public String copy(MultipartFile file) throws IOException{
		String uniqueFileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
		Path rootPath = this.pathFoto(uniqueFileName);
		
		log.info("rootPath: " + rootPath);
		
		Files.copy(file.getInputStream(), rootPath);
		
		return uniqueFileName;
	}

	@Override
	public boolean delete(String filename) {
		Path pathFoto = this.pathFoto(filename);
		File foto = pathFoto.toFile();

		if (foto.exists() && foto.canRead()) {
			if (foto.delete()) {
				return true;
			}
		}
		
		return false;
	}

	public Path pathFoto(String file) {
		return Paths.get(UPLOAD_PATH).resolve(file).toAbsolutePath();
	}
}
