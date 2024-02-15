// package Strings;
// When ever we create a string  it is created into heap because the string is a object bbut its varaibale name would be stored in the stack
    // in java their in no function which can be used to manipulate the string character
    // WAP to print all the substring in the string
    // WAP to print all the substring of even length in the string

public class code1 {
    
    public static void main(String[] args){
        
        String s1="absdkjfk";
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                // System.out.println(s1.substring(i,j+1));
            }
        }      
        
        

        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                String s2=s1.substring(i,j+1);
                if(s2.length()%2==0){
                    System.out.println(s2);
                }
            }
        }        
          
            
    
        
    
    }


    
}
