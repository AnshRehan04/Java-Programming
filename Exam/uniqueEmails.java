import java.util.*;

public class uniqueEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueEmails = new HashSet<>();

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < n; i++) {
            String email = scanner.nextLine();
            String[] parts = email.split("@");
            String local = parts[0].split("\\+")[0].replace(".", "");
            uniqueEmails.add(local + "@" + parts[1]);
        }

        System.out.println(uniqueEmails.size());
        scanner.close();
    }
}
