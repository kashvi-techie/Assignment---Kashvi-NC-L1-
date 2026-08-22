public class sortalgo {
    static class sort{
        int nums[];
        sort (int nums[]){
            this.nums=nums;
        }
        public void bubble(){
            int n=nums.length;
            //works on adjacent element 
            for (int i=0;i<n;i++){
                int found=0;
                for (int j=0;j<n;j++){
                    if (nums[j]<nums[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                    
                }
                if (found==0){
                        break;
                    }
            }
            printArray(nums);
        }
        public void selection(){
            //works on selecting the most minimum one and then working over it 
            int n=nums.length,min=0;
            for (int i=0;i<n;i++){
                int curr=i;
                for (int j=0;j<n;j++){
                    if (nums[j]>nums[min]){
                        min=j;
                    }
                }
                int temp=nums[curr];
                nums[curr]=nums[min];
                nums[min]=temp;
            }
            printArray(nums);
        }
        public void insertion(){
            //previous vala 
            int n=nums.length;
            for (int i = 1; i < n; i++) {
                int key = nums[i];
                int j = i - 1;
                while (j >= 0 && nums[j] > key) {
                    nums[j + 1] = nums[j];
                    j--;
                }
                nums[j + 1] = key;
            }
            printArray(nums);
        }
        public void merge(){
            int n=nums.length;
            for (int i=0;i<n;i++){
                while (n>0){
                    n=n/2;
                    
                }
            }
        }
        static void printArray(int nums[]){
            int i;
            for (i = 0; i < nums.length; i++)
                System.out.print(nums[i] + " ");
            System.out.println();
        }
        
    }                   
    public static void main(String args[]){
        int nums[]={5,1,3,6,2};
        //bubble sort
        sort s1=new sort(nums);
        s1.bubble();
    }
}
