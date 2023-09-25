package com.example.market.controllers;

import com.example.market.dto.UserDTO;
import com.example.market.enums.Role;
import com.example.market.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class AdminController {
    private final UserService userService;

    @GetMapping("/admin")
    public String admin(Model model) {
        ArrayList<UserDTO> dtos = new ArrayList<>();
        for(model : userService.list()) {
            dtos.add(co);
        }
        model.addAttribute("users", dtos);
        return "admin";
    }

    @PostMapping("/admin/user/ban/{id}")
    public String userBan(@PathVariable("id") Long id) {
        userService.banUser(id);
        return "redirect:/admin";
    }

    @GetMapping("/admin/user/edit/{user}")
    public String userEdit(@PathVariable("user") UserDTO userDTO, Model model) {
        model.addAttribute("user", userDTO);
        model.addAttribute("roles", Role.values());
        return "user-edit";
    }

    @PostMapping("/admin/user/edit")
    public String userEdit(@RequestParam("userDTO") UserDTO userDTO, @RequestParam Map<String, String> form) {
        userService.changeUserRoles(userDTO, form);
        return "redirect:/admin";
    }
}