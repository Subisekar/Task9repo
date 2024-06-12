public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 49, n2 = 87, n3 = 35;

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");
        else
            System.out.println(n3 + " is the largest number.");
    }
}
    
