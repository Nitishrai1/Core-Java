package genarics;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.List;

public class code {
    public static void main(String args[]){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);
        l1=l1.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(l1);


        int sum=l1.stream().reduce(0,(ans,x) -> ans+x);
        System.out.println(sum);

    }
    
}
