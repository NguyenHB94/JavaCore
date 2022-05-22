package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Movie {
    // "id": 1,
    //    "title": "Runaway",
    //    "category": ["Action","Animation","Comedy"],
    //    "director": "Delia Hasloch",
    //    "length": 128,
    //    "release": "2010-05-29",
    //    "view": 902
    private int id;
    private String title;
    private String[] category;
    private String director;
    private int length;
    private String release;
    private int view;


}
