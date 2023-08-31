public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }
        System.out.println();

        int i = 1;
        for (; i<9;){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
            i++;
        }
        System.out.println();

        int n = 10;
        for(int i2=0, j = n - 1; i2 < j; i2++, j--){

            System.out.println(i2 * j); // 0 8 14 18 20
        }
        System.out.println();

        int j = 7;
        do{
            System.out.println(j); // 7 6 5 4 3 2 1
            j--;
        }
        while (j > 0);
        System.out.println();

        int j2 = -1;
        do{
            System.out.println(j2); // -1
            j2--;
        }
        while (j2 > 0); // false
        System.out.println();

        int j3 = 6;
        while (j3 > 0){
            System.out.println(j3); // 6 5 4 3 2 1
            j3--;
        }
        System.out.println();

        for (int i2 = 0; i2 < 10; i2++){
            if (i2 == 5)
                break;
            System.out.println(i2); // 0 1 2 3 4
        }
        System.out.println();

        for (int i3 = 0; i3 < 10; i3++){
            if (i3 == 5)
                continue;
            System.out.println(i3);
        }
        System.out.println();

        int i5 = 5;
        while(i5 > 0)
        {
            i5 *= 3;
            i5 *= -2;
        }
        System.out.println(i5);
        System.out.println();

        int j6 = 2;
        for (int i6 = 1; i6 < 100; i6 = i6 + 2)
        {
            j6 = j6 - 1;
            while(j6 < 15)
            {
                j6 = j6 + 5;
                System.out.println("while "+ j6);
            }
            System.out.println("for "+i6);
        }

        for(int i8 = 1; i8 < 3; i8++)
        {
            switch (i8)
            {
                default:
                    System.out.printf("i = %d \n", i8++);
                    break;
            }
        }

    }
}