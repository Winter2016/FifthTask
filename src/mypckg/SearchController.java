package mypckg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Ксения on 3/29/2016.
 */
@Controller
@RequestMapping(value = "/search")
public class SearchController {
    ApplicationContext context = new GenericXmlApplicationContext("config.xml");
    PurchaseDAO purchaseDAO = (PurchaseDAO) context.getBean("purchaseDAO");
    @RequestMapping(method = RequestMethod.GET)
    public String viewSearch(Map<String, Object> model) {
        return "Search";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSearch(@RequestParam(value = "seller", required = false) String seller,
                                @RequestParam(value = "buyer", required = false) String buyer,
                                @RequestParam(value = "book", required = false) String book,
                                Map<String, Object> model) {

        List<Purchase> purchases = purchaseDAO.searchLine(seller, buyer, book);
        model.put("purchases", purchases);
        return "SearchSuccess";
    }
}