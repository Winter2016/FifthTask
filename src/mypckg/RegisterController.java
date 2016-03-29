package mypckg;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {
    ApplicationContext context = new GenericXmlApplicationContext("config.xml");
    PurchaseDAO purchaseDAO = (PurchaseDAO) context.getBean("purchaseDAO");
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        Purchase purchaseForm = new Purchase();
        model.put("purchaseForm", purchaseForm);
        return "Registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("purchaseForm") Purchase purchase,
                                      Map<String, Object> model) {
        purchaseDAO.addLine(purchase);

        return "RegistrationSuccess";
    }
}