package com.example.mvc.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
//import java.sql.Date;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos")
@Entity
public class Affair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private Integer priority;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date date;

}
