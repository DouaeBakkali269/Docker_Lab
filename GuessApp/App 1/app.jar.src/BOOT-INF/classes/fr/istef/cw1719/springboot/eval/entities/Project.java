/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.entities;
/*    */ 
/*    */ @Entity(name = "projects")
/*    */ public class Project {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long id;
/*    */   @Length(min = 3, max = 20)
/*    */   private String title;
/*    */   @Length(min = 3, max = 255)
/*    */   private String description;
/*    */   
/* 13 */   public void setId(Long id) { this.id = id; } @Length(min = 3, max = 100) private String mode; private Integer budget; private Date startDate; @ManyToOne @JoinColumn(name = "manager_id", nullable = false) private User user; public void setTitle(String title) { this.title = title; } public void setDescription(String description) { this.description = description; } public void setMode(String mode) { this.mode = mode; } public void setBudget(Integer budget) { this.budget = budget; } public void setStartDate(Date startDate) { this.startDate = startDate; } public void setUser(User user) { this.user = user; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof fr.istef.cw1719.springboot.eval.entities.Project)) return false;  fr.istef.cw1719.springboot.eval.entities.Project other = (fr.istef.cw1719.springboot.eval.entities.Project)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$title = getTitle(), other$title = other.getTitle(); if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;  Object this$description = getDescription(), other$description = other.getDescription(); if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description)) return false;  Object this$mode = getMode(), other$mode = other.getMode(); if ((this$mode == null) ? (other$mode != null) : !this$mode.equals(other$mode)) return false;  Object this$budget = getBudget(), other$budget = other.getBudget(); if ((this$budget == null) ? (other$budget != null) : !this$budget.equals(other$budget)) return false;  Object this$startDate = getStartDate(), other$startDate = other.getStartDate(); if ((this$startDate == null) ? (other$startDate != null) : !this$startDate.equals(other$startDate)) return false;  Object this$user = getUser(), other$user = other.getUser(); return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user)); } protected boolean canEqual(Object other) { return other instanceof fr.istef.cw1719.springboot.eval.entities.Project; } public int hashCode() { int PRIME = 59; result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $title = getTitle(); result = result * 59 + (($title == null) ? 43 : $title.hashCode()); Object $description = getDescription(); result = result * 59 + (($description == null) ? 43 : $description.hashCode()); Object $mode = getMode(); result = result * 59 + (($mode == null) ? 43 : $mode.hashCode()); Object $budget = getBudget(); result = result * 59 + (($budget == null) ? 43 : $budget.hashCode()); Object $startDate = getStartDate(); result = result * 59 + (($startDate == null) ? 43 : $startDate.hashCode()); Object $user = getUser(); return result * 59 + (($user == null) ? 43 : $user.hashCode()); } public String toString() { return "Project(id=" + getId() + ", title=" + getTitle() + ", description=" + getDescription() + ", mode=" + getMode() + ", budget=" + getBudget() + ", startDate=" + getStartDate() + ", user=" + getUser() + ")"; } public Project(Long id, String title, String description, String mode, Integer budget, Date startDate, User user) {
/* 14 */     this.id = id; this.title = title; this.description = description; this.mode = mode; this.budget = budget; this.startDate = startDate; this.user = user;
/*    */   }
/*    */   public Project() {}
/*    */   
/*    */   public Long getId() {
/* 19 */     return this.id;
/*    */   } public String getTitle() {
/* 21 */     return this.title;
/*    */   } public String getDescription() {
/* 23 */     return this.description;
/*    */   }
/* 25 */   public String getMode() { return this.mode; }
/* 26 */   public Integer getBudget() { return this.budget; } public Date getStartDate() {
/* 27 */     return this.startDate;
/*    */   }
/*    */   public User getUser() {
/* 30 */     return this.user;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\entities\Project.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */