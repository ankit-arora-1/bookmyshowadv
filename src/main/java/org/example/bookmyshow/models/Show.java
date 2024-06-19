package org.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel {
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private Date endTime;
    private List<Feature> features;
}
