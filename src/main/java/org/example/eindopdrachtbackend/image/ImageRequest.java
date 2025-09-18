package org.example.eindopdrachtbackend.image;

import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

public class ImageRequest {
    @NotNull
    private MultipartFile file;

    public MultipartFile getFile() { return file; }
    public void setFile(MultipartFile file) { this.file = file; }
}

