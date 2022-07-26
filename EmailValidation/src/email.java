import java.util.ArrayList;

public class email{

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        
        emailID.add("sumanth.4@gmail.com");
        emailID.add("suchethpalagummi@gmail.com");
        emailID.add("pranav@gmail.com");
        emailID.add("jashere@gmail.com");
        emailID.add("ravikanth@gmail.com");
        emailID.add("aakasah@gmail.com");
       
        int c = 0;
        
   
        String searchEmail = "suchethpalagummi@gmail.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    
                    if(searchEmail==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                       c = 1;
                        
                        break;
                        
                    }
                }
                
                if(c==1)
                {System.out.println("email ID :" + searchEmail + "  is found");}
                else{System.out.println("email ID Not found");}

    }

}