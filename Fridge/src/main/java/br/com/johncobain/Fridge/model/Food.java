package br.com.johncobain.Fridge.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "food_table")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime expirationDate;
    private Integer quantity;

    public Food() {
    }

    public Food(String name, LocalDateTime expirationDate, Integer quantity) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }
}
