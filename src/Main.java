import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public  void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "libro", "Books", 139.99 ));
        products.add(new Product(2L, "fumetto","Books",9.99));
        products.add(new Product(3L, "agenda", "Baby", 12.47 ));
        products.add(new Product(4L, "dizionario", "Baby", 19.59));
        products.add(new Product(5L,"enciclopedia","Books", 154.90));

        List<Product> librimaggioridi100 = products.stream() .filter(libro -> libro.getCategory().contains("Books") && libro.getPrice() > 100).collect(Collectors.toList());
        librimaggioridi100.forEach(libro -> System.out.println(libro.getName()+ ", prezzo: "  + libro.getPrice()));

        Customer cliente1 = new Customer(1L,"primo cliente", 3);
        Customer cliente2 = new Customer(2L,"secondo cliente", 4);
        Customer cliente3 = new Customer(3L,"terzo cliente", 2);
        Customer cliente4 = new Customer(4L,"ultimo cliente", 7);


        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L,"delivered", LocalDate.of(12,3,2023), LocalDate.of(17,3,2023), List.of(products.get(0)),cliente1));
        orders.add(new Order(2L,"shipping", LocalDate.of(10,2,2022), LocalDate.of(14,2,2022), List.of(products.get(0)),cliente2));
        orders.add(new Order(3L,"shipped", LocalDate.of(7,6,2019), LocalDate.of(9,6,2019), List.of(products.get(0)),cliente3));
        orders.add(new Order(4L,"processed", LocalDate.of(22,7,2024), LocalDate.of(29,7,2024), List.of(products.get(0)),cliente4));

        List <Order> ordinibambini = orders.stream()

    }

}



