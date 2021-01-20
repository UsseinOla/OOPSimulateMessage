
import java.util.ArrayList;

/**
 *
 * @author samih
 */
public class mailBox {
    private ArrayList<message> mb = new ArrayList<>();
    // --- Constructor
    public mailBox () {
        
    }
    // --- Add message
    public void addMessage(message m) {
        mb.add(m);
    }
    // --- Delete message
    public void deleleMessage(int i) {
        if (i < mb.size())
            mb.remove(i);
    }
    // Get specific message
    public message getMessage(int i) {
        return mb.get(i);
    }
    // --- Get the size 
    public int getSize() {
        return mb.size();
    }
    // ---- Clear all
    public void clearAll() {
        mb.clear();
    }
    // ---- To string
    @Override
    public String toString() {
        String s= "";
        int i;
        for (i=0; i<mb.size(); i++) {
            s = s + "Sender: " + mb.get(i).getSendermail() + '\n' + "Receiver: " + mb.get(i).getReceivermail() + '\n' + "Sent message: " + mb.get(i).getTxt();
            s = s + "\n-------------------------\n";
        }
        return s;
    }
}
