package mypckg;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Ксения on 3/28/2016.
 */
public class PurchaseDAO implements Serializable {
    private javax.sql.DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public void addLine(Purchase purchase)
    {
        String sql = "insert into purchase(buy_date, seller, buyer, book, amount, cost) values(?, ?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql,new Object[] {purchase.getBuy_date(), purchase.getSeller(), purchase.getBuyer(), purchase.getBook(), purchase.getAmount(), purchase.getCost()} );
    }

    public void deleteLine(int id) {
        String sql = "delete from purchase where id =?;";
        jdbcTemplate.update(sql, new Object[] {id});
    }

    public List<Purchase> searchLine(String seller, String buyer, String book)
    {
        if (seller == null) seller = "";
        if (buyer == null) buyer = "";
        if (book == null) book = "";
        String sql = "select * from purchase where seller like '%" + seller + "%' and buyer like '%" + buyer + "%'and book like '%" +  book + "%';";
        return jdbcTemplate.query(sql, new PurchaseMapper());
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
}
