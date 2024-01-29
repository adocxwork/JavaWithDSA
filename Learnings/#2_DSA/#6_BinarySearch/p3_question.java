public class p3_question {
    static int squareRoot(int x){ //linear approach
        int y=1;
        while((y*y)<=x){
            y++;
        }
        return y-1;
    }
    static int squareRootBS(int x){
        int ans=-1, st=0, end=x;
        while (st<=end) {
            int mid = st + (end-st)/2;
            int val = mid*mid; //use long to avoid overflow
            if(val==x){
                return mid;
            } else if(val < x){
                ans = mid; //for non perfect squares
                st = mid + 1;
            } else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(24));
        System.out.println(squareRootBS(24));
    }
}
