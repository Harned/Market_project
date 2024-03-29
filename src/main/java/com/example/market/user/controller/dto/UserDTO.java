package com.example.market.user.controller.dto;

import com.example.market.image.controller.dto.ImageDTO;
import com.example.market.product.controllers.model.ProductDTO;
import com.example.market.user.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDTO implements UserDetails {
    private Long id;
    @Email
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "Введите корректный номер. Например,9235325531)")
    private String phone;
    @NotNull(message = "Введите имя")
    private String name;
    private boolean active;
    private ImageDTO avatar;
    private String password;
    private Set<Role> roles = new HashSet<>();
    private List<ProductDTO> productDTOS = new ArrayList<>();
    private LocalDateTime dateOfCreated;

    private void init() {
        dateOfCreated = LocalDateTime.now();
    }
    public boolean isAdmin() {
        return roles.contains(Role.ROLE_ADMIN);
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }
    @Override
    public String getUsername() {
        return email;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return active;
    }
}

