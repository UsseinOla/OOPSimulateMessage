/**
 * @author majoud
 */
public class receiverClass {
     private message receivedMessage;
    private mailBox mb= new mailBox();
    private char gender;
    private String name;
    private int age;
    private String email;
   //====== Constructors ================
    receiverClass (String name) {
        this.gender = 'M';
        this.name = name;
        this.age = 0;
        this.email = name + "@liu.edu.lb"; 
    }
    //==================================   
    public String getname() {
        return this.name;
    }
    //---------------------------------   
    public String getemail() {
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
    //====================================
    public void setrcvmessage (message s) {
        mb.addMessage(s); 
         receivedMessage = s;
    }
    // ==================================== 
    public message getrcvmessage (int i){
        if (i == -1)   // return last received message
            return mb.getMessage(mb.getSize()-1);
        return mb.getMessage(i);
    }
    // ================================= 
    public void receive(message s){
        setrcvmessage(s);
    }
    //==================================
    public void deleteAllMessages() {
       mb.clearAll();    
    }
    public void deleteMessage(int i) {
        mb.deleleMessage(i);
    }
    //==================================
    @Override
    public String toString() {
        return mb.toString();
    }
}
