package pascalTriangle;


import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {

    /**
     * C(n+1,i)=C(n,i)+C(n,i-1)
     *
     */
    public static List<List<Integer>> generate(int numRows) {


        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
            List<Integer> v = new ArrayList<>();
            pascalTriangle.add(v);

            if (i == 0) {
                v.add(1);
            }
            else {

                List<Integer> t = pascalTriangle.get(i - 1);

                v.add(1);
                for (int j=1; j<i; j++) {
                    v.add(t.get(j) + t.get(j-1));
                }
                v.add(1);
            }
        }
        return pascalTriangle;
    }

    public static void print(List<List<Integer>> list) {
        StringBuilder sb = new StringBuilder();

        int size = list.size();
        sb.append("[\r\n");
        for (int i=0; i<list.size(); i++) {
            addBlank(sb, size);
            size--;

            List<Integer> inner = list.get(i);
            sb.append("[");
            for (int j=0; j<inner.size(); j++) {
                sb.append(inner.get(j));
                if (j < inner.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");

            if (i < list.size() - 1) {
                sb.append(",\r\n");
            }

        }
        sb.append("\r\n]");
        System.out.println(sb.toString());
    }

    private static void addBlank(StringBuilder sb, int num) {
        for (int i=0; i<num; i++) {
            sb.append(" ");
        }
    }

    public static void main(String[] args) {
        print(generate(5));
    }

}