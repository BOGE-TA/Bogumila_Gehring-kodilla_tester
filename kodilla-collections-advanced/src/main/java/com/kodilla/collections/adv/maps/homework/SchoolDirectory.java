import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        // Dodanie przykładowych danych
        schoolMap.put(new Principal("John Smith"), new School("Greenwood High", Arrays.asList(25, 30, 28, 32)));
        schoolMap.put(new Principal("Alice Johnson"), new School("Sunrise Elementary", Arrays.asList(20, 22, 21)));
        schoolMap.put(new Principal("Michael Brown"), new School("Lakeside Middle School", Arrays.asList(27, 26, 30, 29, 28)));

        // Iteracja po mapie i wyświetlanie danych
        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println("Principal: " + principal.getName());
            System.out.println("School: " + school.getName());
            System.out.println("Total students: " + school.getTotalStudents());
            System.out.println("-----------------------------------");
        }
    }
}
