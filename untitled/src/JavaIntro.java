public class JavaIntro {

    public static void main(String[] args) {
        String nameAndSurname = " irina inashvili";
        long number2 = 1000000000;
        char symbol = 'a';
        boolean isItTrue = true;

//        for (int i = 0; i < names.length; i+=3) {
//            System.out.println("Age: " + ages[i] + " Name: " + names[i]);
//        }
//        for (String name : names) {
//            for (int age : ages){
//                System.out.println(name + " " + age);
//            }
//        }
        // System.out.println(ages.length);
        String[] surnames;
        surnames = new String[]{"Inashvili", "sdfsf"};
        // number1 = number1++;
        // System.out.println(number1);
        //System.out.println(number1++);
//        while (number1 < 10) {
//            System.out.println(number1);
//        }
//        do {
//            System.out.println(number1);
//        }
//        while (number1 <10);
        int number1 = 9;
//        if (number1 > 10) {
//            System.out.println("Gamarjoba es pirveli if-ia");
//        } else if (number1 == 10) {
//            System.out.println("meore if shi shemovida");
//        } else if (number1 < 10) {
//            System.out.println("mesame if shi shemovida");
//        } else {
//            System.out.println("Gagimarjos");
//        }
//        int[] ages = {23, 31, 25, 35, 21, 26, 36};
//        for (int age :
//                ages) {
//           switch (age){
//               case 23:
//                   System.out.println("es irinaa");
//                   break;
//               case 25:
//                   System.out.println("es tazoa");
//                   break;
//               default:
//                   System.out.println("ar vici vinaa");
//           }
//        }

        int[] ages = {23, 31, 25, 35, 21, 26, 36};
        getNames(3, ages);
    }

    public static void getNames(int index, int[] ages){
        String[] names = {"Irina", "Nia", "Tazo", "Sopo", "Nika", "Dito", "Giga"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Age: " + ages[i] + " Name: " + names[index]);
        }
    }

}
