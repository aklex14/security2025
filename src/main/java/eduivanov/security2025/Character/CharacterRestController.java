package eduivanov.security2025.Character;

/* 
  @author  User
  @project  IntelliJ IDEA
  @class  CharacterRestController
  version 1.0.0
  @since 30.09.2025 - 23.45
*/
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/characters")
@AllArgsConstructor
public class CharacterRestController {

    private final CharacterService service;

    @GetMapping
    public List<Character> getCharacters() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Character getOneCharacter(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping
    public Character create(@RequestBody Character character) {
        return service.create(character);
    }

    @PutMapping
    public Character update(@RequestBody Character character) {
        return service.update(character);
    }
}
