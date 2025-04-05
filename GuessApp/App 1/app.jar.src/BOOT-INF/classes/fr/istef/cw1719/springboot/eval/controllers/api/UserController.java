/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.controllers.api;
/*    */ 
/*    */ import fr.istef.cw1719.springboot.eval.entities.User;
/*    */ import fr.istef.cw1719.springboot.eval.services.UserService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.http.HttpStatus;
/*    */ import org.springframework.http.ResponseEntity;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ @RestController
/*    */ @RequestMapping({"/api/v1/user"})
/*    */ public class UserController
/*    */ {
/*    */   private final UserService userService;
/*    */   
/*    */   @Autowired
/*    */   public UserController(UserService userService) {
/* 22 */     this.userService = userService;
/*    */   }
/*    */   
/*    */   @GetMapping({""})
/*    */   public ResponseEntity<List<User>> getUsers() {
/* 27 */     return new ResponseEntity(this.userService.findUsers(), HttpStatus.OK);
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\controllers\api\UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */