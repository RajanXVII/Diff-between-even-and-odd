
import java.util.*;
import java.util.stream.Collectors;
class HelloWorld {
    public static void getDiff(int[] arr){
    List<Integer> nums=new ArrayList();
    for(int i=0;i<arr.length;i++){
        nums.add(arr[i]);
    }
     List<Integer> filteredEven=nums.stream().filter(num->num%2==0).collect(Collectors.toList());
     List<Integer> filteredOdd=nums.stream().filter(num->num%2!=0).collect(Collectors.toList());
     int sumsOdd=filteredOdd.stream().mapToInt(ar->ar.intValue()).sum();
     int sumseven=filteredEven.stream().mapToInt(ar->ar.intValue()).sum();
     System.out.println(sumsOdd-sumseven); 
}
    public static void main(String[] args) { 
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        getDiff(arr);
    }
}
