import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tekst: ");
        String input = scanner.nextLine();

     int changes = 0;
      StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
              c = Character.toLowerCase(c);
              changes++;
            }
          result.append(c);
 }
      System.out.println("Tekst: " + result.toString());
            System.out.println("Liczba zmian: " + changes);
    }
 }
   