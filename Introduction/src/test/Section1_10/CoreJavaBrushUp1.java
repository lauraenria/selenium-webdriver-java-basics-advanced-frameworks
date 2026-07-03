package test.Section1_10;

public class CoreJavaBrushUp1 {

    public static void main(String[] args) {

        // Variabili Primitive e Stringhe
        int myNum = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value stored in the myNum variable");
        System.out.println(website);
        System.out.println(letter + " " + dec + " " + myCard);

        // Arrays - Dichiarazione con allocazione fissa
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        // Arrays - Dichiarazione immediata (Literal)
        int[] arr2 = { 1, 2, 4, 5, 6 };

        System.out.println("Primo elemento di arr2: " + arr2[0]);

        // Ciclo for classico per arr
        System.out.println("--- Ciclo arr ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Ciclo for classico per arr2
        System.out.println("--- Ciclo arr2 ---");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // Array di Stringhe
        String[] name = { "rahul", "shetty", "selenium" };

        // Ciclo for classico per l'array di stringhe
        System.out.println("--- Ciclo nomi (classico) ---");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        // Ciclo Enhanced for (For-Each) - Più pulito
        System.out.println("--- Ciclo nomi (enhanced) ---");
        for (String s : name) {
            System.out.println(s);
        }
    }
}
