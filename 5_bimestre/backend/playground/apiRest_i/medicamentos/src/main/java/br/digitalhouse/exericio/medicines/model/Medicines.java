package br.digitalhouse.exericio.medicines.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medicines {
    private Integer id;
    private String name;
    private String laboratory;
    private Integer amount;
    private Double price;
}
