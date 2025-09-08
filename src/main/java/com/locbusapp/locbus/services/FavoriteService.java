package com.locbusapp.locbus.services;

import com.locbusapp.locbus.DTO.FavoriteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FavoriteService {

    private Long nextId = 1L;
    private List<FavoriteDTO> favoriteDTOList = new ArrayList<>();

    // Adicionar favorito
    public FavoriteDTO addFavorite(FavoriteDTO favorite) {
        favorite.setId(nextId++);
        favoriteDTOList.add(favorite);
        return favorite;
    }

    // Listar favoritos de um usuário
    public List<FavoriteDTO> listFavoritesByUser(Long userId) {

        return favoriteDTOList.stream()
                .filter(f -> f.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

    // Remover favorito pelo ID
    public boolean removeFavorite(Long favoriteId) {
        return favoriteDTOList.removeIf(f -> f.getId().equals(favoriteId));
    }
}
