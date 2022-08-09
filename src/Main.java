public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }
    // Task 1
    public static void task1() {
    int i = 1;
    while (i < 11) {
        System.out.print(i + " ");
        i++;
    }
        System.out.print("\n");
    for (int j = 10; j > 0; j--) {
        System.out.print(j + " ");
    }
        System.out.print("\n");
    }

    // Task 2
    public static void task2() {
    int firstFriday = 4;
    do {
        System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        firstFriday += 7;
    } while (firstFriday <=31);

    }

    // Task 3
    public static void task3() {
    int year = 2022;
    int year_200 = year - 200;
    int year_100 = year + 100;
    for (int i = 0; i <= year_100; i += 79) {
        if (i >= year_200 && i <= year_100) {
            System.out.println(i);
        }
    }
    }

    // Task 4
    public static void task4() {
    for (int i = 1; i <=30; i++) {
        System.out.print(i+": ");
        if (i % 3 == 0 && i % 5 ==0) {
            System.out.print("ping pong");
        } else if (i % 3 == 0) {
            System.out.print("ping");
        } else if (i % 5 ==0) {
            System.out.print("pong");
        }
        System.out.println();
    }
    }

    // task 5
    public static void task5() {
    int n0 = 0, n1 = 1, n2;
        System.out.print(n0 + " " + n1 + " ");
    for (int i = 1; i < 9; i ++) {
        n2 = n0 + n1;
        System.out.print(n2 + " ");
        n0 = n1;
        n1 = n2;
    }
    }
}