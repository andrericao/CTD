package br.digitalhouse.exercise.apiconsuption.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class DentistListResponse {
    private List<DentistSumarizedResponse> dentistas;
}
