package sia.tacocloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
private OrderAdminService adminService;

AdminController(OrderAdminService orderAdminService) {
    this.adminService = orderAdminService;
}

@PostMapping("/deleteOrders")
    public String deleteAllOrders() {
    adminService.deleteAllOrders();
    return "redirect:/admin";
}

}
