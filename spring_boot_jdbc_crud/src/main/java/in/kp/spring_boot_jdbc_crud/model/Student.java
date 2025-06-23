package in.kp.spring_boot_jdbc_crud.model;

public class Student {

    private int id;
    private String name;
    private String email;
  


    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
       
    }

    Student(){
        
    }
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        }
        public String getEmail() {
            return email;
            }
            public void setEmail(String email) {
                this.email = email;
            }
            
    
}
