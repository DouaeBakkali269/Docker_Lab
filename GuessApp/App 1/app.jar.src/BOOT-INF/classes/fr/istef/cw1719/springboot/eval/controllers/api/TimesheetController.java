/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.controllers.api;
/*    */ 
/*    */ import fr.istef.cw1719.springboot.eval.entities.Timesheet;
/*    */ import fr.istef.cw1719.springboot.eval.entities.TimesheetTask;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.Random;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ @RestController
/*    */ @RequestMapping({"/api/v1/timesheet"})
/*    */ public class TimesheetController
/*    */ {
/*    */   @GetMapping({"/project/{id}"})
/*    */   public Timesheet getProjectTimesheet(@PathVariable Long id) {
/* 21 */     Timesheet ts = new Timesheet();
/* 22 */     ts.setBu(Integer.valueOf(getRandomNumberInRange(0, 16)));
/* 23 */     ts.setId(Long.valueOf(getRandomNumberInRange(1000, 2000)));
/* 24 */     ts.setLastUpdate(new Date());
/*    */     
/* 26 */     ArrayList<Integer> members = new ArrayList<>();
/* 27 */     int nbMembers = getRandomNumberInRange(2, 8);
/* 28 */     for (int i = 0; i < nbMembers; i++) {
/* 29 */       members.add(Integer.valueOf(getRandomNumberInRange(1, 100)));
/*    */     }
/* 31 */     ts.setMembers(members);
/*    */     
/* 33 */     ArrayList<TimesheetTask> tasks = new ArrayList<>();
/* 34 */     int nbTask = getRandomNumberInRange(2, 8);
/* 35 */     for (int j = 0; j < nbTask; j++) {
/*    */ 
/*    */ 
/*    */       
/* 39 */       TimesheetTask t = new TimesheetTask("", Integer.valueOf(getRandomNumberInRange(25, 60)), Integer.valueOf(getRandomNumberInRange(2, 35)));
/*    */       
/* 41 */       tasks.add(t);
/*    */     } 
/* 43 */     ts.setTasks(tasks);
/* 44 */     return ts;
/*    */   }
/*    */   
/*    */   private int getRandomNumberInRange(int min, int max) {
/* 48 */     if (min >= max) {
/* 49 */       throw new IllegalArgumentException("max must be greater than min");
/*    */     }
/* 51 */     Random r = new Random();
/* 52 */     return r.nextInt(max - min + 1) + min;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\controllers\api\TimesheetController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */