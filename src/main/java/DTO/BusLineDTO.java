package DTO;

import entities.BusLine;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;


@Getter
@Setter
public class BusLineDTO {
    private Long id;
    private String code;
    private String name;

    public BusLineDTO(BusLine entity) {
        BeanUtils.copyProperties(entity, this);
        this.id = entity.getId();
        this.code = entity.getCode();
        this.name = entity.getName();
    }



}
