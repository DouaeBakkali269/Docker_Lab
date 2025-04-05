package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.repositories;

import fr.istef.cw1719.springboot.eval.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\repositories\UserRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */