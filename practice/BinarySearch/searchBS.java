package BinarySearch.BinarySearchQuestions;

public class searchBS {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int students = 2;
        int ans = bookAllocation(arr,students);
        System.out.println(ans);
    }
    static  int bookAllocation(int[] books, int students){
        if(books.length<students){
            return -1;
        }
        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int i = 0; i < books.length; i++) {
            if(books[i]>start){
                start= books[i];
            }
            end += books[i];
        }
        int res = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(isAllocationProssible(books,mid,students)){
                res = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return res;
    }

    static boolean isAllocationProssible(int[] books, int maxPages, int students) {
        int currentStudents = 1;
        int pages  =0;
        for (int i = 0; i < books.length; i++) {
            pages+=books[i];
            if(pages>maxPages){
                currentStudents+=1;
                pages = books[i];
            }
            if(currentStudents>students){
                return false;
            }
        }
        return true;
    }
}
