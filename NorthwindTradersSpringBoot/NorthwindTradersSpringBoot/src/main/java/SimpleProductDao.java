import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import com.pluralsight.NorthwindTradersSpringBoot.ui.ProductDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products = new ArrayList<>();

    public SimpleProductDao() {
        products.add(new Product(001, "Macbook Pro", "Computers", 1200.00));
        products.add(new Product(002, "iPhone 20", "Phones", 999.99));
        products.add(new Product(003, "AirPods", "Headphones", 350.00));

    }
    @Override
    public void addProduct(Product product) {
        products.add(product);
    }
    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}
