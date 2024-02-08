import java.util.Arrays;

public class ATM {

    private Integer[] bills;
    private Integer counter;

    public Integer[] getBill() {
        return bills;
    }

    public int getCounter() {
        return counter;
    }

    public ATM(int n) {

        this.bills = new Integer[]{500, 200, 100, 50, 20, 10};
        this.counter = 0;

        if (n > 1500 || n % 10 != 0) {
            counter = -1;
        } else {
            for (int i : bills) {
                while (n >= i) {
                    n -= i;
                    this.counter ++;
                }
            }
        }
    }

    public static void main (String[] args) {

        ATM test = new ATM(770);

        System.out.println("There are 6 different bills. Those are: " + Arrays.toString(test.getBill()));
        System.out.println("And we get in return " + test.getCounter());







    }

}

