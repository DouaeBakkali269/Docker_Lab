/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.entities;
/*    */ 
/*    */ 
/*    */ @Entity(name = "tasks")
/*    */ public class Task {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long id;
/*    */   @Length(min = 3, max = 30)
/*    */   private String num;
/*    */   
/* 12 */   public void setId(Long id) { this.id = id; } private Integer hourCost; @Column(unique = true) private Integer duration; public void setNum(String num) { this.num = num; } public void setHourCost(Integer hourCost) { this.hourCost = hourCost; } public void setDuration(Integer duration) { this.duration = duration; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof fr.istef.cw1719.springboot.eval.entities.Task)) return false;  fr.istef.cw1719.springboot.eval.entities.Task other = (fr.istef.cw1719.springboot.eval.entities.Task)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$num = getNum(), other$num = other.getNum(); if ((this$num == null) ? (other$num != null) : !this$num.equals(other$num)) return false;  Object this$hourCost = getHourCost(), other$hourCost = other.getHourCost(); if ((this$hourCost == null) ? (other$hourCost != null) : !this$hourCost.equals(other$hourCost)) return false;  Object this$duration = getDuration(), other$duration = other.getDuration(); return !((this$duration == null) ? (other$duration != null) : !this$duration.equals(other$duration)); } protected boolean canEqual(Object other) { return other instanceof fr.istef.cw1719.springboot.eval.entities.Task; } public int hashCode() { int PRIME = 59; result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $num = getNum(); result = result * 59 + (($num == null) ? 43 : $num.hashCode()); Object $hourCost = getHourCost(); result = result * 59 + (($hourCost == null) ? 43 : $hourCost.hashCode()); Object $duration = getDuration(); return result * 59 + (($duration == null) ? 43 : $duration.hashCode()); } public String toString() { return "Task(id=" + getId() + ", num=" + getNum() + ", hourCost=" + getHourCost() + ", duration=" + getDuration() + ")"; } public Task(Long id, String num, Integer hourCost, Integer duration) {
/* 13 */     this.id = id; this.num = num; this.hourCost = hourCost; this.duration = duration;
/*    */   }
/*    */   public Task() {}
/*    */   
/*    */   public Long getId() {
/* 18 */     return this.id;
/*    */   }
/* 20 */   public String getNum() { return this.num; } public Integer getHourCost() {
/* 21 */     return this.hourCost;
/*    */   } public Integer getDuration() {
/* 23 */     return this.duration;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\entities\Task.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */