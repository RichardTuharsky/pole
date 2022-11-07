public class Hlavna {
    public static void main(String[] args) {

        int [] pole = new int [] {42, 55,3,64,22,17,78,89,23,7};
        int temp = 0;

        //vypiseme nezotriedene pole
        for (int i = 0; i <pole.length; i++) {
            System.out.print(pole[i] + " ");
        }

        for (int i = 0; i <pole.length; i++) {
            for (int j = i+1; j <pole.length; j++) {
                if(pole[i] >pole[j]) {
                    temp = pole[i];
                    pole[i] = pole[j];
                    pole[j] = temp;
                }
            }
        }

        //vypiseme zotriedene
        System.out.println('\n');
        for (int i = 0; i <pole.length; i++) {
            System.out.print(pole[i] + " ");
        }
    }
}   