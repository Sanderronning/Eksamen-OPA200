
package controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Sindre Holm Torgersen
 */
public class examController {

    private static final String DB_URL = "";
    private static final String DB_USER = "student";
    private static final String DB_PASSWORD = "student";
    

    /**
     * Gets unique course names (from exams) from the database.
     */
    public List<String> getUniqueExamTitles() {
        List<String> titles = new ArrayList<>();
        String sql = """
            SELECT DISTINCT c.title AS course_title
            FROM exam e
            JOIN course c ON e.course_id = c.course_id
            ORDER BY c.title;
        """;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                titles.add(rs.getString("course_title"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return titles;
    }
}
