package eduivanov.security2025.Character;

/* 
  @author  User
  @project  IntelliJ IDEA
  @class  item
  version 1.0.0
  @since 30.09.2025 - 22.33
*/

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Character {
    @Id
    private String id;
    private String name;
    private String description;

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Character character)) return false;
        return getId().equals(character.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}