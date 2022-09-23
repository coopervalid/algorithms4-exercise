import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomNum {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int count = Integer.parseInt(args[1]);
        double sum = 0.0,temp;
        StdRandom.setSeed(N);
        while(count != 0){
            temp = StdRandom.uniformDouble();
            StdOut.println(count);
            StdOut.println(temp);
            sum += temp;
            count--;
        }
        StdOut.println(sum/1000);
    }
}
