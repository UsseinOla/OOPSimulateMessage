
//import ceng310oop.CENG310OOP;
/**
 * @author majoud
 */
public class senderClass {
        private mailBox hu= new mailBox();
        
    private char gender;
    private String name;
    private int age;
    private String email;
   //====== Constructors ================
    public senderClass (String name) {
        this.gender = 'M';
        this.name = name;
        this.age = 0;
        this.email = name + "@liu.edu.lb"; 
    }
    //==================================
    public String getName() {
        return this.name;
    }
   
    public String getEmail() {
        return this.email;
    }   
    
    
    //----------------------------------
    public void setEmail(String e) {
        this.email = e;
    }
    //----------------------------------
    public void setAge (int a) {
        this.age = a;
    }
    // =================================
    public void send (String txt,receiverClass rcv) {
        message s = new message (txt,email, rcv.getemail());
        rcv.receive(s);
        hu.addMessage(s);///////////////////////////
    }   
    
    
 
    
    
    
    
    
        @Override
     public String toString() {
        return hu.toString();
    }

   
    
    
    
    
}
