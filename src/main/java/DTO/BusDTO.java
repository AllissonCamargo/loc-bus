package DTO;


import entities.Bus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class BusDTO {
    private Long id;
    private String plate;
    private double latitude;
    private double longitude;


    public BusDTO(Bus entity) {
        BeanUtils.copyProperties(entity, this);
        this.id = entity.getId();
        this.plate = entity.getPlate();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();

    }

}
