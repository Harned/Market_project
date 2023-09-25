package com.example.market.converters;

import com.example.market.dto.ImageDTO;
import com.example.market.entity.Image;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ImageConverter {

    public Image dtoToModel(ImageDTO dto) {
        return new Image(dto.getId(),
                dto.getName(),
                dto.getOriginalFileName(),
                dto.getSize(),
                dto.getContentType(),
                dto.isPreviewImage(),
                dto.getBytes(),
                dto.getProductDTO());
    }

    public Image modelToDto(Image model) {
        return new Image(model.getId(),
                model.getName(),
                model.getOriginalFileName(),
                model.getSize(),
                model.getContentType(),
                model.isPreviewImage(),
                model.getBytes(),
                model.getProduct());
    }
}