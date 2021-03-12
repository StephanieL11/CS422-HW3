import java.util.List;

public class Q2 {

    /**
     *
     * @return a random int between 0 and 100 inclusive
     */
    public int getRandomInt() {
        return (int) (Math.random() * 100);
    }

    public void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int getSumList(List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }

    public float getAverageList(List<Integer> list) {
        return (getSumList(list) / list.size());
    }

}
