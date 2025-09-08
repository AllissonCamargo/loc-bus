package com.locbusapp.locbus.controllers;

import com.locbusapp.locbus.DTO.FavoriteDTO;
import com.locbusapp.locbus.services.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    // Adicionar favorito
    @PostMapping
    public FavoriteDTO addFavorite(@RequestBody FavoriteDTO favoriteDTO) {
        return favoriteService.addFavorite(favoriteDTO);
    }

    // Listar favoritos de um usuário
    @GetMapping("/{userId}")
    public List<FavoriteDTO> listFavoritesByUser(@PathVariable Long userId) {
        return favoriteService.listFavoritesByUser(userId);
    }

    // Remover favorito pelo ID
    @DeleteMapping("/{favoriteId}")
    public String removeFavorite(@PathVariable Long favoriteId) {
        boolean removed = favoriteService.removeFavorite(favoriteId);
        return removed ? "Favorito removido com sucesso!" : "Favorito não removido";
    }
}
