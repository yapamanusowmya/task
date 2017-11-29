
package Arrays;

import java.util.Arrays;

public class cparray {

    public static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];
        b = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; ++i) {
            System.out.print(b[i] + " ");
        }
    }
}
