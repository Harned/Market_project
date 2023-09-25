package com.example.market.converters;

import com.example.market.dto.ProductDTO;
import com.example.market.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductConverter {

    public Product dtoToModel(ProductDTO dto) {
        return new Product(dto.getId(),
                dto.getTitle(),
                dto.getDescription(),
                dto.getPrice(),
                dto.getLocation(),
                dto.getImageDTOS(),
                dto.getPreviewImageId(),
                dto.getUserDTO(),
                dto.getDateOfCreated());
    }

    public Product modelToDto(Product model) {
        return new Product(model.getId(),
                model.getTitle(),
                model.getDescription(),
                model.getPrice(),
                model.getLocation(),
                model.getImages(),
                model.getPreviewImageId(),
                model.getUser(),
                model.getDateOfCreated());
    }
}
