package com.example.ormpractice.sinan.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class AirportDto {

    //private int Id;


    private String AirportName;

    private String AirportCode;

    private Integer LocationId;

    private String Status;

    //private Boolean IsDeleted;

    //private Date CreatedAt;

    //private Date LastModifiedAt;
}
