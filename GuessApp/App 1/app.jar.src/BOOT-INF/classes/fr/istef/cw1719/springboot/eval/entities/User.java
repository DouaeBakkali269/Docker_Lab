/*    */ package BOOT-INF.classes.fr.istef.cw1719.springboot.eval.entities;
/*    */ 
/*    */ 
/*    */ @Entity(name = "users")
/*    */ public class User {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   private Long id;
/*    */   @Length(min = 3, max = 255)
/*    */   private String firstname;
/*    */   
/* 12 */   public void setId(Long id) { this.id = id; } @Length(min = 3, max = 255) private String lastname; @Column(unique = true) private String email; @Length(min = 10, max = 10) private String tel; public void setFirstname(String firstname) { this.firstname = firstname; } public void setLastname(String lastname) { this.lastname = lastname; } public void setEmail(String email) { this.email = email; } public void setTel(String tel) { this.tel = tel; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof fr.istef.cw1719.springboot.eval.entities.User)) return false;  fr.istef.cw1719.springboot.eval.entities.User other = (fr.istef.cw1719.springboot.eval.entities.User)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$firstname = getFirstname(), other$firstname = other.getFirstname(); if ((this$firstname == null) ? (other$firstname != null) : !this$firstname.equals(other$firstname)) return false;  Object this$lastname = getLastname(), other$lastname = other.getLastname(); if ((this$lastname == null) ? (other$lastname != null) : !this$lastname.equals(other$lastname)) return false;  Object this$email = getEmail(), other$email = other.getEmail(); if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email)) return false;  Object this$tel = getTel(), other$tel = other.getTel(); return !((this$tel == null) ? (other$tel != null) : !this$tel.equals(other$tel)); } protected boolean canEqual(Object other) { return other instanceof fr.istef.cw1719.springboot.eval.entities.User; } public int hashCode() { int PRIME = 59; result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $firstname = getFirstname(); result = result * 59 + (($firstname == null) ? 43 : $firstname.hashCode()); Object $lastname = getLastname(); result = result * 59 + (($lastname == null) ? 43 : $lastname.hashCode()); Object $email = getEmail(); result = result * 59 + (($email == null) ? 43 : $email.hashCode()); Object $tel = getTel(); return result * 59 + (($tel == null) ? 43 : $tel.hashCode()); } public String toString() { return "User(id=" + getId() + ", firstname=" + getFirstname() + ", lastname=" + getLastname() + ", email=" + getEmail() + ", tel=" + getTel() + ")"; } public User(Long id, String firstname, String lastname, String email, String tel) {
/* 13 */     this.id = id; this.firstname = firstname; this.lastname = lastname; this.email = email; this.tel = tel;
/*    */   }
/*    */   public User() {}
/*    */   
/*    */   public Long getId() {
/* 18 */     return this.id;
/*    */   } public String getFirstname() {
/* 20 */     return this.firstname;
/*    */   } public String getLastname() {
/* 22 */     return this.lastname;
/*    */   } public String getEmail() {
/* 24 */     return this.email;
/*    */   } public String getTel() {
/* 26 */     return this.tel;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\Downloads\Lab001\GuessApp\App 1\app.jar!\BOOT-INF\classes\fr\istef\cw1719\springboot\eval\entities\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */