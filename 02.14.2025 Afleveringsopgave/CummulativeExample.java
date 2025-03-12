public class CummulativeExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0; // initialize sum til 0

        //Loop igennem array og læg alle tal sammen
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Cumulative Sum: " + sum);
    }
    
}
