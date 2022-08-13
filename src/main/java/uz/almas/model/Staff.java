package uz.almas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    private String name;
    private Integer age;
    private String[] position;              // array
    private List<String> skills;            // list
    private Map<String, BigDecimal> salary; // map
}
