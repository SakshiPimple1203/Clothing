package clothingstore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;

@WebServlet("/addOrder")
public class ClothingOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String item = request.getParameter("item");
            String customerName = request.getParameter("customerName");
            String phoneNumber = request.getParameter("phoneNumber");
            BigDecimal shoulder = new BigDecimal(request.getParameter("shoulder"));
            BigDecimal chest = new BigDecimal(request.getParameter("chest"));
            BigDecimal bust = new BigDecimal(request.getParameter("bust"));
            BigDecimal waist = new BigDecimal(request.getParameter("waist"));
            BigDecimal hipRound = new BigDecimal(request.getParameter("hipRound"));
            BigDecimal armRound = new BigDecimal(request.getParameter("armRound"));
            BigDecimal sleeves = new BigDecimal(request.getParameter("sleeves"));
            BigDecimal penaltyCrease = new BigDecimal(request.getParameter("penaltyCrease"));
            BigDecimal length = new BigDecimal(request.getParameter("length"));
            BigDecimal backNeck = new BigDecimal(request.getParameter("backNeck"));
            BigDecimal frontNeck = new BigDecimal(request.getParameter("frontNeck"));
            String note = request.getParameter("note");
            Date deliveryDate = Date.valueOf(request.getParameter("deliveryDate"));

            ClothingOrder order = new ClothingOrder(item, customerName, phoneNumber, shoulder, chest, bust, waist, hipRound, armRound, sleeves, penaltyCrease, length, backNeck, frontNeck, note, deliveryDate);
            ClothingOrderDao orderDao = new ClothingOrderDao();
            
            String result = orderDao.insert(order);
            response.getWriter().print(result);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print("Error: " + e.getMessage());
        }
    }
}
