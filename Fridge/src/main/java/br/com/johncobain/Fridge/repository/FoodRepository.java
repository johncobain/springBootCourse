package br.com.johncobain.Fridge.repository;

import br.com.johncobain.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
