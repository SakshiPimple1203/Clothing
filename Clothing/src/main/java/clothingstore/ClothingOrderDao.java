package clothingstore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClothingOrderDao {
    private String dburl = "jdbc:mysql://localhost:3306/bootique";
    private String dbuname = "root";
    private String dbPassword = "Sakship#12";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl, dbuname, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public String insert(ClothingOrder order) {
        loadDriver(dbDriver);
        Connection con = getConnection();
        String result = "Order placed successfully";
        String sql = "INSERT INTO clothing_orders (item, customer_name, phone_number, shoulder, chest, bust, waist, hip_round, arm_round, sleeves, penalty_crease, length, back_neck, front_neck, note, delivery_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, order.getItem());
            ps.setString(2, order.getCustomerName());
            ps.setString(3, order.getPhoneNumber());
            ps.setBigDecimal(4, order.getShoulder());
            ps.setBigDecimal(5, order.getChest());
            ps.setBigDecimal(6, order.getBust());
            ps.setBigDecimal(7, order.getWaist());
            ps.setBigDecimal(8, order.getHipRound());
            ps.setBigDecimal(9, order.getArmRound());
            ps.setBigDecimal(10, order.getSleeves());
            ps.setBigDecimal(11, order.getPenaltyCrease());
            ps.setBigDecimal(12, order.getLength());
            ps.setBigDecimal(13, order.getBackNeck());
            ps.setBigDecimal(14, order.getFrontNeck());
            ps.setString(15, order.getNote());
            ps.setDate(16, order.getDeliveryDate());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            result = "Order not placed: " + e.getMessage();
        }
        return result;
    }

    public List<ClothingOrder> searchByName(String customerName) {
        loadDriver(dbDriver);
        Connection con = getConnection();
        List<ClothingOrder> orders = new ArrayList<>();
        String sql = "SELECT * FROM clothing_order WHERE customer_name LIKE ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + customerName + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ClothingOrder order = new ClothingOrder();
                order.setItem(rs.getString("item"));
                order.setCustomerName(rs.getString("customer_name"));
                order.setPhoneNumber(rs.getString("phone_number"));
                order.setShoulder(rs.getBigDecimal("shoulder"));
                order.setChest(rs.getBigDecimal("chest"));
                order.setBust(rs.getBigDecimal("bust"));
                order.setWaist(rs.getBigDecimal("waist"));
                order.setHipRound(rs.getBigDecimal("hip_round"));
                order.setArmRound(rs.getBigDecimal("arm_round"));
                order.setSleeves(rs.getBigDecimal("sleeves"));
                order.setPenaltyCrease(rs.getBigDecimal("penalty_crease"));
                order.setLength(rs.getBigDecimal("length"));
                order.setBackNeck(rs.getBigDecimal("back_neck"));
                order.setFrontNeck(rs.getBigDecimal("front_neck"));
                order.setNote(rs.getString("note"));
                order.setDeliveryDate(rs.getDate("delivery_date"));
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
