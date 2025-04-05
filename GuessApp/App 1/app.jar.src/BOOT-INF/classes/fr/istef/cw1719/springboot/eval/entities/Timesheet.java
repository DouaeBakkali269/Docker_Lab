/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.entities;
/*    */ 
/*    */ import fr.istef.cw1719.springboot.eval.entities.TimesheetTask;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class Timesheet {
/*    */   private Long id;
/*    */   private ArrayList<Integer> members;
/*    */   
/* 10 */   public void setId(Long id) { this.id = id; } private Integer bu; private Date lastUpdate; private ArrayList<TimesheetTask> tasks; public void setMembers(ArrayList<Integer> members) { this.members = members; } public void setBu(Integer bu) { this.bu = bu; } public void setLastUpdate(Date lastUpdate) { this.lastUpdate = lastUpdate; } public void setTasks(ArrayList<TimesheetTask> tasks) { this.tasks = tasks; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof fr.istef.cw1719.springboot.eval.entities.Timesheet)) return false;  fr.istef.cw1719.springboot.eval.entities.Timesheet other = (fr.istef.cw1719.springboot.eval.entities.Timesheet)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object<Integer> this$members = (Object<Integer>)getMembers(), other$members = (Object<Integer>)other.getMembers(); if ((this$members == null) ? (other$members != null) : !this$members.equals(other$members)) return false;  Object this$bu = getBu(), other$bu = other.getBu(); if ((this$bu == null) ? (other$bu != null) : !this$bu.equals(other$bu)) return false;  Object this$lastUpdate = getLastUpdate(), other$lastUpdate = other.getLastUpdate(); if ((this$lastUpdate == null) ? (other$lastUpdate != null) : !this$lastUpdate.equals(other$lastUpdate)) return false;  Object<TimesheetTask> this$tasks = (Object<TimesheetTask>)getTasks(), other$tasks = (Object<TimesheetTask>)other.getTasks(); return !((this$tasks == null) ? (other$tasks != null) : !this$tasks.equals(other$tasks)); } protected boolean canEqual(Object other) { return other instanceof fr.istef.cw1719.springboot.eval.entities.Timesheet; } public int hashCode() { int PRIME = 59; result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object<Integer> $members = (Object<Integer>)getMembers(); result = result * 59 + (($members == null) ? 43 : $members.hashCode()); Object $bu = getBu(); result = result * 59 + (($bu == null) ? 43 : $bu.hashCode()); Object $lastUpdate = getLastUpdate(); result = result * 59 + (($lastUpdate == null) ? 43 : $lastUpdate.hashCode()); Object<TimesheetTask> $tasks = (Object<TimesheetTask>)getTasks(); return result * 59 + (($tasks == null) ? 43 : $tasks.hashCode()); } public String toString() { return "Timesheet(id=" + getId() + ", members=" + getMembers() + ", bu=" + getBu() + ", lastUpdate=" + getLastUpdate() + ", tasks=" + getTasks() + ")"; } public Timesheet(Long id, ArrayList<Integer> members, Integer bu, Date lastUpdate, ArrayList<TimesheetTask> tasks) {
/* 11 */     this.id = id; this.members = members; this.bu = bu; this.lastUpdate = lastUpdate; this.tasks = tasks;
/*    */   }
/*    */   public Timesheet() {}
/* 14 */   public Long getId() { return this.id; }
/* 15 */   public ArrayList<Integer> getMembers() { return this.members; }
/* 16 */   public Integer getBu() { return this.bu; }
/* 17 */   public Date getLastUpdate() { return this.lastUpdate; } public ArrayList<TimesheetTask> getTasks() {
/* 18 */     return this.tasks;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\entities\Timesheet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */