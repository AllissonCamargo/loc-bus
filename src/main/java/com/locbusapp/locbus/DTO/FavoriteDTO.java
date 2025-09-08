package com.locbusapp.locbus.DTO;


public class FavoriteDTO {
    private Long id;               // id único do favorito
    private Long userId;           // dono do favorito
    private String type;           // "BUS" ou "ROUTE"
    private Long favoriteObjectID; // id do ônibus ou rota


    public FavoriteDTO() {
    }

    public FavoriteDTO(Long id, Long userId, String type, Long favoriteObjectID) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.favoriteObjectID = favoriteObjectID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getFavoriteObjectID() {
        return favoriteObjectID;
    }

    public void setFavoriteObjectID(Long favoriteObjectID) {
        this.favoriteObjectID = favoriteObjectID;
    }
}
