package pl.sebastianstrzalkowski.fishcards.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sebastianstrzalkowski.fishcards.models.FishCard;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FishCardRepository extends CrudRepository<FishCard, Long> {

}