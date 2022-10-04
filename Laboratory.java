import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    // COMPLETE-ME
    // Construa um ArrayList<String> contendo informações de contato (ContactInfo)
    // de cada um dos estudantes e professores
    ArrayList<String> members = new ArrayList<String>();
    Integer i;
    for(i = 0; i < this.students.size(); i++){
        members.add(this.students.get(i).getContactInfo());
    }
    for(i = 0; i < this.professors.size(); i++){
        members.add(this.professors.get(i).getContactInfo());
    }
    return members;    
  }

  public boolean userExists(String userId) {
    // COMPLETE-ME
    // Verifique se existe o userId na lista de estudantes ou de professores
    Integer i;
    for(i = 0; i < this.students.size(); i++){
        if(this.students.get(i).getUserId() == userId){
            return true;
        }
    }
    for(i = 0; i < this.professors.size(); i++){
        if(this.professors.get(i).getUserId() == userId){
            return true;
        }
    }
    return false;
  }

  public int countMembers() {
    // COMPLETE-ME
    // Retorne o total de membros do laboratório (estudantes e professores)
    return this.students.size() + this.professors.size();
  }


}