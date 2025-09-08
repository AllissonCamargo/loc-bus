package com.locbusapp.locbus.DTO;

public class BusDTO {
    private Long id;
    private String plate;
    private double latitude;
    private double longitude;
    private boolean active;

    public BusDTO() {
    }

    public BusDTO(Long id, String plate, double latitude, double longitude, boolean active) {
        this.id = id;
        this.plate = plate;
        this.latitude = latitude;
        this.longitude = longitude;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
