/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.services;
/*    */ 
/*    */ import fr.istef.cw1719.springboot.eval.entities.User;
/*    */ import fr.istef.cw1719.springboot.eval.repositories.UserRepository;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class UserService
/*    */ {
/*    */   private final UserRepository userRepository;
/*    */   
/*    */   @Autowired
/*    */   public UserService(UserRepository userRepository) {
/* 16 */     this.userRepository = userRepository;
/*    */   }
/*    */   
/*    */   public List<User> findUsers() {
/* 20 */     return (List<User>)this.userRepository.findAll();
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\services\UserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */