
public class Sort012 {
	
	public static void sort012(int[] arr) {
		
		int count0=0,count1=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}else if(arr[i]==1) {
				count1++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<count0+count1;i++) {
			arr[i]=1;
		}
		for(int i=count0+count1;i<arr.length;i++) {
			arr[i]=2;
		}
		
	}

// class Solution {
//     public void sortColors(int[] nums) {
//        int low=0,mid=0,high=nums.length-1;
//         while(mid<=high){
            
//             if(nums[mid]==0){
//                 int temp=nums[low];
//                 nums[low]=nums[mid];
//                 nums[mid]=temp;
//                 mid++;
//                 low++;
//             }
//             else if(nums[mid]==1){
//                 mid++;
//             }
//             // if(nums[mid]==2){
//             else{
//                 int temp=nums[high];
//                 nums[high]=nums[mid];
//                 nums[mid]=temp;
//                 // mid++;
//                 high--;
//             }
//         }
        
//     }
// }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=Array.takeInput();
		sort012(arr);
		Array.printArray(arr);

	}

}
