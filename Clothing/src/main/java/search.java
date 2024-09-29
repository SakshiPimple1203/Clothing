import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class search extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public search() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String customerName = request.getParameter("customerName");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bootique", "root", "Sakship#12");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM clothing_orders WHERE customer_name = ?");
            ps.setString(1, customerName);

            out.print("<html><head><title>Search Results</title></head><body>");
            out.print("<h2>Search Results</h2>");

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                out.print("<p>No orders found for customer: " + customerName + "</p>");
            } else {
                out.print("<table border='1'>");
                ResultSetMetaData rsmd = rs.getMetaData();
                int totalColumn = rsmd.getColumnCount();
                
                // Print table headers
                out.print("<tr>");
                for (int i = 1; i <= totalColumn; i++) {
                    out.print("<th>" + rsmd.getColumnName(i) + "</th>");
                }
                out.print("</tr>");

                // Print table rows
                do {
                    out.print("<tr>");
                    for (int i = 1; i <= totalColumn; i++) {
                        out.print("<td>" + rs.getString(i) + "</td>");
                    }
                    out.print("</tr>");
                } while (rs.next());

                out.print("</table>");
            }

            out.print("</body></html>");

        } catch (Exception e) {
            out.print(e);
        }
    }
}
