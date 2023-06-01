package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.Product;
import org.koreait.entities.Seller;
import org.koreait.repositories.ProductRepository;
import org.koreait.repositories.SellerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jpa/exam3")
@RequiredArgsConstructor
public class JPAExam3Controller {
    public final SellerRepository sellerRepository;
    public final ProductRepository productRepository;

    private void insertData() {
        List<Seller> sellers = new ArrayList<>();
        for (int i = 1; i <= 5; i++ ) {
            Seller seller = Seller.builder()
                    .storeNm("판매처" + i)
                    .build();
            sellers.add(seller);
        }

        sellers = sellerRepository.saveAllAndFlush(sellers);

        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= 5; i++ ) {
            Product product = Product.builder()
                    .productNm("상품" + i)
                    .sellers(sellers)
                    .build();
            products.add(product);
        }

        products = productRepository.saveAllAndFlush(products);

        for (Seller seller : sellers) {
            seller.setProducts(products);
        }

        sellerRepository.flush();
    }

    @GetMapping("/ex01")
    public void ex01() {
        insertData();
    }

    @GetMapping("/ex02")
    public void ex02() {
        Seller seller = sellerRepository.findById(1L).orElse(null);
        List<Product> products = seller.getProducts();
        products.stream().forEach(System.out::println);
    }

    @GetMapping("/ex03")
    public void ex03() {
        Product product = productRepository.findById(1L).orElse(null);
        List<Seller> sellers = product.getSellers();
        sellers.stream().forEach(System.out::println);
    }
}
