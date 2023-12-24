import java.util.*;
class Twounbiaseddice{

    public static int dice(int[]ar1, int[]arr2,int target){
        int n1=ar1.length;
        int n2=arr2.length;
        int count=0;
        if(target>6 || target<12){
              for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(ar1[i]+arr2[j]==target){
                    count++;
                }
            }
          
        }
        return count;

        }
        return 0;
      

    }
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6};
        int []arr2={1,2,3,4,5,6};
        int n1=arr1.length;
        int n2=arr2.length;
        Scanner sc= new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(dice(arr1, arr2, target));
        
    }
}