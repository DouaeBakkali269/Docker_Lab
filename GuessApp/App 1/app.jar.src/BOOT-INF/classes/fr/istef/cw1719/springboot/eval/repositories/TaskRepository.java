package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.repositories;

import fr.istef.cw1719.springboot.eval.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {}


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\repositories\TaskRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */