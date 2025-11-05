package dao;
import java.sql.*;
import model.teacher;

public class teacherDao {

    private final String URL = "jdbc:mysql://localhost:3306/university";
    private final String USER = "root"; // MySQL username
    private final String PASSWORD = ""; // MySQL password (empty for XAMPP default)

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void registerTeacher(teacher teacher) {
        String sql = "INSERT INTO teacher (name, email, course, tlfNr) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, teacher.getName());
            pstmt.setString(2, teacher.getEmail());
            pstmt.setString(3, teacher.getCourse());
            pstmt.setString(4, teacher.getTlfNr());

            pstmt.executeUpdate();
            System.out.println("Teacher registered successfully!");

        } catch (SQLException e) {
            System.out.println("Error registering teacher: " + e.getMessage());
        }
    }
}
