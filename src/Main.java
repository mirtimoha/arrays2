public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат в день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Средняя сумма трат за месяу составила " + total / 30 + " рублей");
    }
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}