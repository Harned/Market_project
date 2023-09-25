package com.example.market.converters;

import com.example.market.dto.UserDTO;
import com.example.market.entity.Image;
import com.example.market.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@AllArgsConstructor
public class UserConverter {
private final ImageConverter imageConverter;
    public User dtoToModel(UserDTO dto) {
        ArrayList<Image> image
        return new User(dto.getId(),
                           dto.getEmail(),
                           dto.getPhone(),
                            dto.getName(),
                            dto.isEnabled(),
                            imageConverter.dtoToModel(dto.getAvatar()),
                            dto.getPassword(),
                            dto.getRoles(),
                            dto.getProductDTOS(),
                            dto.getDateOfCreated());
    }

    public User modelToDto(User model) {
        return new User(model.getId(),
                model.getEmail(),
                model.getPhone(),
                model.getName(),
                model.isActive(),
                model.getAvatar(),
                model.getPassword(),
                model.getRoles(),
                model.getProductEntities(),
                model.getDateOfCreated());
    }
}
