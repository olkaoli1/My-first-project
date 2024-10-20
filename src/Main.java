public class Main {
    public static void main(String[] args) {
        int eaters = 5;
        int water = 3000;
        int potatoes = 5;
        int chicken = 6;
        int spices = 10;

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров(a) воды");
        System.out.println((potatoes / eaters) + " картофелин(a/ы)");
        System.out.println((chicken / eaters) + " куриных(ое) бедер(по)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");
    }
}