package com.locbusapp.locbus.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BusDTO {
    private Long id;
    private String Plate;
    private double latitude;
    private double longitude;
    private boolean active;


}
