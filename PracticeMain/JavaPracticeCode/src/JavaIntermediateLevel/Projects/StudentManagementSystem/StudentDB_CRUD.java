package JavaIntermediateLevel.Projects.StudentManagementSystem;

import java.sql.*;

public class StudentDB_CRUD {

    //READ -    Get DBInfo
    private static final String getquery ="select * from students;";

    //    INSERT - inserting values into db
    private static final String insertquery ="insert into students(studentname,phone) values(?,?)";

    //    UPDATE - updating db values
    private static final String updatequery ="UPDATE students SET studentname = ? WHERE stdid = ?";

    //   DELETE - updating db values
    private static final String deletequery ="delete from students where stdid=?";

//    =============== METHODS() -- CRUD OPERATIONS ===============================
//  INSERT Method
    public static boolean insetStudentDB(StudentBluePrint newstd){
// getting connection strings
        Connection con = stdDBConn.createConn();
boolean f = false;
        try {
            PreparedStatement insertstmt = con.prepareStatement(insertquery); //stmt
            insertstmt.setString(1,newstd.getStudentName()); // set values
            insertstmt.setInt(2,newstd.getPhone()); // set values

            int rows = insertstmt.executeUpdate(); //execute query
            if (rows>0){
                System.out.println("New student added successfully!");
            }else {
                System.out.println("Insertion failed!");
            }
 f= true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
return f;
    }

//  DELETE Method
    public static boolean deleteStudentById(int stdid){
        Connection conn = stdDBConn.createConn();

        boolean f = false;
        try {
            PreparedStatement deletestmt = conn.prepareStatement(deletequery);
            deletestmt.setInt(1,stdid);

            deletestmt.executeUpdate();

            f = true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return f;
    }

//  READ Method
    public static boolean showAllStudents(){
        Connection conn = stdDBConn.createConn();
        boolean f = false;

        try {

            Statement showstmt = (Statement) conn.createStatement();

           java.sql.ResultSet rs = showstmt.executeQuery(getquery);

           while (rs.next()){
               System.out.println("ID : "+rs.getInt(1));
               System.out.println("Name : "+rs.getString(2));
               System.out.println("Phone : "+rs.getInt(3));
               System.out.println("============================================");
           }

           return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//  UPDATE Method
    public static boolean UpdateStudentInfo(int id, String newName){
        Connection conn = stdDBConn.createConn();
        boolean f = false;

        try {
            PreparedStatement updateStmt = conn.prepareStatement(updatequery);
            updateStmt.setString(1,newName);
            updateStmt.setInt(2,id);

           int rows =  updateStmt.executeUpdate();
           if (rows>0){
               System.out.println("updted student info success!");
               f = true;

           }else {
               System.out.println("Failed student info updation!");
           }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

}


