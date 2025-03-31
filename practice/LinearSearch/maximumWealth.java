package LinearSearch;

public class maximumWealth {
    public static void main(String[] args) {
        int [][] arr= {
                {11,22,33},
                {44,55,1001},
                {66,88,9},
        };
        System.out.println(maximumW(arr));
    }
    static int maximumW(int [] [] arr){
        int ans  = Integer.MIN_VALUE;
        for(int [] i:arr){
            int sum = 0;
            for(int j:i){
               sum+=j;
            }
            if(sum>ans){
                ans=sum;
            }
        }return ans;
    }
}
