package eduivanov.security2025.Character;

/* 
  @author  User
  @project  IntelliJ IDEA
  @class  CharacterService
  version 1.0.0
  @since 30.09.2025 - 23.40
*/
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CharacterService {

    private final CharacterRepository repository;

    private List<Character> characters = new ArrayList<>();

    @PostConstruct
    void init() {
        characters.add(new Character("1", "John", "Main hero of the story"));
        characters.add(new Character("2", "Alice", "Wizard with healing powers"));
        characters.add(new Character("3", "Drake", "Warrior with a dark past"));
        repository.saveAll(characters);
    }

    public List<Character> getAll() {
        return repository.findAll();
    }

    public Character getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public Character create(Character character) {
        return repository.save(character);
    }

    public Character update(Character character) {
        return repository.save(character);
    }
}
