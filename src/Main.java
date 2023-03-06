public class Main {

    public static void main(String[] args) {

        task1();
        task2();

    }// End of main

    public static void task1() {

        System.out.println();
        System.out.println("Задача 1");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        double[] arrayDouble = {1.57, 7.654, 9.968};

        float[] arrayFloat = {1.57f, 3.14f, 6.28f};

    }// End of task

    public static void task2() {

        System.out.println();
        System.out.println("Задача 2");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if (i < arrayInt.length - 1)
            System.out.print(",");
        }
        System.out.println();

        double[] arrayDouble = {1.57, 7.654, 9.968};
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]);
            if (i < arrayDouble.length - 1)
                System.out.print(",");
        }
        System.out.println();

        float[] arrayFloat = {1.57f, 3.14f, 6.28f};
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i < arrayFloat.length - 1)
                System.out.print(",");
        }
    }// End of task

} // End of main