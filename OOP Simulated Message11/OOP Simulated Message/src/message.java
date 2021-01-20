/**
 * @author majoud
 */
    public class message{
        private String txt;
        private String sendermail;
        private String receivermail;
        public message (String txt, String senderm,String receiverm) {
            this.txt = txt;
            this.receivermail = receiverm;
            this.sendermail = senderm;
        }
        
          public message(String txt){
      this.txt=txt;
      
      
      }
        
        String getTxt () {
            return txt;
        }
        String getSendermail () {
            return sendermail;
        }                
        String getReceivermail () {
            return receivermail;
        }    
    
        
    }

