package conditionstatements;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if((s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u') || (s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' ||s.charAt(i)=='O' || s.charAt(i)=='U')){
                count++;
            }
        }
        System.out.println("Number os vowels is: "+count);
        sc.close();

    }
    
}

