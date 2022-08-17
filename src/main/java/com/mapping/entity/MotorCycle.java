package com.mapping.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MotorCycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String modelName;
    private String manufacturerName;
    private String gearBox;
    private String Wheels;
    private String length;
    private String height;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Engine engine;
}
