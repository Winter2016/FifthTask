package mypckg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Ксения on 3/29/2016.
 */
@Controller
@RequestMapping(value = "/delete")
public class DeleteController {
    ApplicationContext context = new GenericXmlApplicationContext("config.xml");
    PurchaseDAO purchaseDAO = (PurchaseDAO) context.getBean("purchaseDAO");
    @RequestMapping(method = RequestMethod.GET)
    public String viewDelete(Map<String, Object> model) {
        return "Delete";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processDelete(@RequestParam(value = "id", required = true) int id,
                                      Map<String, Object> model) {

        purchaseDAO.deleteLine(id);
        model.put("id", id);
        return "DeleteSuccess";
    }
}