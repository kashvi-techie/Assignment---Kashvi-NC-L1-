import java.util.*;
public class dsa {
    public void subarray() {
        //sub arrays
        int nums[]={5,2,-1,0,3};
        int n=nums.length,k=3;
        int max = Integer.MIN_VALUE;
        //the sum of two
        int sum=0;
        for (int i=0;i<n;i++){
            k=3;
            sum = sum - nums[i-k] + nums[i];
            if(k==0){
                continue;
            }
            if (sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
    public void givensum(){
        //Subarray with Given Sum
        int nums[]={15, 2, 4, 8, 9, 5, 10, 23};
        int target=23,from=0,till=0; //[2,5]
        int n=nums.length;
        int sum=0;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                sum+=nums[j];
                if (sum==target){
                    till=nums[j+1];
                    break;
                }
            }
            if (sum!=target){
                sum=0;
            }
            else{
                from=nums[i];
                break;
            }
        }
        int ans[]={from,till};
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int nums[]={15, 2, 4, 8, 9, 5, 10, 23};
        int target=40,from=0,till=0; //[2,5]
        int n=nums.length,c=0;
        int prod=1;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                prod*=nums[j];
                if (prod==target){
                    break;
                }
            }
            if (prod==target){
                break;
            }
            else{
                c++;;
            }
        }
        System.out.println(c);
    }
    
}



