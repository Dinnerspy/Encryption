
public class EncryptionCreater {

    String Key, CleanPassword, EncripedPassword="", Continue, nonDupKey;
    String Alphabet="abcdefghijklmnopqrstuvwxyz";
    int KeyLength, Counter, Counter2, passLength;
    char[] ABCS = new char[27];

    public EncryptionCreater(String UserKey, String UserPassword) {

        Key = UserKey;
        CleanPassword = UserPassword;

    }

    public void setCleanPass(String UserPassword) {
        CleanPassword = UserPassword;

    }
    
    public void setNonDupKey(){
    KeyLength = Key.length();
    nonDupKey= Key.substring(0,1);
    Counter=0;
    while(Counter<KeyLength){
    if(nonDupKey.contains(Character.toString((Key.charAt(Counter))))){
    
    
    
    }else{
    
    nonDupKey = nonDupKey +Character.toString((Key.charAt(Counter)));
    }
    Counter++;
    }
    
    Counter=0;
    while(Counter<26){
    if(nonDupKey.contains(Character.toString((Alphabet.charAt(Counter))))){
    
    
    
    }else{
    
    nonDupKey = nonDupKey +Character.toString((Alphabet.charAt(Counter)));
    }
    Counter++;
    }
    
    }

    public void EncryptABCS() {
      
        this.setNonDupKey();
        KeyLength = nonDupKey.length();

        Counter = 0;
        Counter2 = 0;
        while (Counter < KeyLength) {
            
             ABCS[Counter]= nonDupKey.charAt(Counter);
                
            Counter++;
        }
        //System.out.println(ABCS);//debug line
        this.EncryptPassword();
        
     
    }
    
    public void EncryptPassword(){
    passLength= CleanPassword.length();
    Counter=0;
    while(Counter<passLength){
        
       
       EncripedPassword =  EncripedPassword+ ABCS[(int)CleanPassword.charAt(Counter)-97];
    Counter++;
    }
    
    System.out.println(EncripedPassword);
    }

    public void reset() {

        CleanPassword = "";
        EncripedPassword = "";

    }

}
