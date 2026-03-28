public class RemoveElements {
    public static void main(String[] args){
        int[] nums  = {3,2,2,3};
        int val =3;

        int ans = remove(nums,val);
        System.out.println(ans);
    }
    public static int remove(int[] nums, int v){
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=v) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
