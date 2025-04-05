/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.entities;
/*    */ 
/*    */ public class TimesheetTask {
/*    */   private String num;
/*    */   private Integer hourCost;
/*    */   private Integer duration;
/*    */   
/*  8 */   public void setNum(String num) { this.num = num; } public void setHourCost(Integer hourCost) { this.hourCost = hourCost; } public void setDuration(Integer duration) { this.duration = duration; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof fr.istef.cw1719.springboot.eval.entities.TimesheetTask)) return false;  fr.istef.cw1719.springboot.eval.entities.TimesheetTask other = (fr.istef.cw1719.springboot.eval.entities.TimesheetTask)o; if (!other.canEqual(this)) return false;  Object this$num = getNum(), other$num = other.getNum(); if ((this$num == null) ? (other$num != null) : !this$num.equals(other$num)) return false;  Object this$hourCost = getHourCost(), other$hourCost = other.getHourCost(); if ((this$hourCost == null) ? (other$hourCost != null) : !this$hourCost.equals(other$hourCost)) return false;  Object this$duration = getDuration(), other$duration = other.getDuration(); return !((this$duration == null) ? (other$duration != null) : !this$duration.equals(other$duration)); } protected boolean canEqual(Object other) { return other instanceof fr.istef.cw1719.springboot.eval.entities.TimesheetTask; } public int hashCode() { int PRIME = 59; result = 1; Object $num = getNum(); result = result * 59 + (($num == null) ? 43 : $num.hashCode()); Object $hourCost = getHourCost(); result = result * 59 + (($hourCost == null) ? 43 : $hourCost.hashCode()); Object $duration = getDuration(); return result * 59 + (($duration == null) ? 43 : $duration.hashCode()); } public String toString() { return "TimesheetTask(num=" + getNum() + ", hourCost=" + getHourCost() + ", duration=" + getDuration() + ")"; } public TimesheetTask(String num, Integer hourCost, Integer duration) {
/*  9 */     this.num = num; this.hourCost = hourCost; this.duration = duration;
/*    */   }
/*    */   public TimesheetTask() {}
/* 12 */   public String getNum() { return this.num; }
/* 13 */   public Integer getHourCost() { return this.hourCost; } public Integer getDuration() {
/* 14 */     return this.duration;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\entities\TimesheetTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */