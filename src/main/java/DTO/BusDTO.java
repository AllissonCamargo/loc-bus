package DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

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
