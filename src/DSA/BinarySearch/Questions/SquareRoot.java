package DSA.BinarySearch.Questions;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(square3(14));
        System.out.println(square(25));
    }

    // Efficient Solution
    public static int square3(int x) {
        int s = 1;
        int e = x;
        int ans = -1;
        while(s <= e) {
            int mid = (s+e)/2;
            int sq = mid * mid;
            if(sq == x) {
                return mid;
            }else if(sq > x) {
                e = mid - 1;
            }else{
                s = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    // Sir's Solution
    public static int square2(int x) {
        int i = 1;
        while(i*i <= x) {
            i++;
        }
        return (i-1);
    }

    // My Naive Solution
    public static int square(int x) {
        for (int i = 1; i <= x; i++) {
            int sum = i*i;
            if(sum == x) {
                return i;
            }
            if(sum > x) {
                return i - 1;
            }
        }

        return -1;
    }
}
