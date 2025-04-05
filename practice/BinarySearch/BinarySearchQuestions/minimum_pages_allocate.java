package BinarySearch.BinarySearchQuestions;

public class minimum_pages_allocate {
    public static void main(String[] args) {
        int [] arr = {32,49,61,88};
        int numOfStd = 2;
        int totalSum = 0;
        for (int num:arr){
            totalSum+=num;
        }
        //System.out.println(totalSum);

        int largestEl=Integer.MIN_VALUE;
        for (int num:arr){
            if(num>largestEl){
                largestEl=num;
            }
        }
      //  System.out.println(largestEl);
       int ans = find(arr,numOfStd,largestEl,totalSum);
        System.out.println(ans);
    }
    static int find(int[] book, int students,int start, int end){
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(book,mid,students)){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] book, int mid, int student){
        int countStd = 1;
        int pages = 0;
        for(int i = 0;i<book.length;i++){
             pages+=book[i];
             if(pages>mid){
                 countStd++;
                 pages =book[i];
             }if(countStd>student){
                 return false;
            }
        }
        return true;
    }
}
// revise this question