package eduivanov.security2025.Character;

/* 
  @author  User
  @project  IntelliJ IDEA
  @class  CharacterRepository
  version 1.0.0
  @since 30.09.2025 - 23.36
*/
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {
}
