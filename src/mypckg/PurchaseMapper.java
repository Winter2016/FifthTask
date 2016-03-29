package mypckg;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ксения on 3/28/2016.
 */
public class PurchaseMapper implements RowMapper<Purchase> {
    @Override
    public Purchase mapRow(ResultSet resultSet, int i) throws SQLException
    { Purchase purchase = new Purchase();
        purchase.setBuy_date(resultSet.getDate("buy_date"));
        purchase.setSeller(resultSet.getString("seller"));
        purchase.setBuyer(resultSet.getString("buyer"));
        purchase.setBook(resultSet.getString("book"));
        purchase.setAmount(resultSet.getInt("amount"));
        purchase.setCost(resultSet.getInt("cost"));
        return purchase; }
}
