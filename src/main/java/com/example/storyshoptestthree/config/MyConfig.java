package com.example.storyshoptestthree.config;



import com.example.storyshoptestthree.dto.ProductDto;
import com.example.storyshoptestthree.entity.product.ProductEntity;
import com.example.storyshoptestthree.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@CrossOrigin
@RequestMapping("/prod")
public class MyConfig {


    @Autowired
    private IProductService iProductService;

    @GetMapping("/all")
    public List<ProductDto> getAllProduct() {
        return iProductService.getAllProduct();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id) {
        return iProductService.getByid(id);
    }

    @PostMapping("")
    public ProductEntity addNewProduct(@RequestBody ProductDto productDto) {
        ProductEntity product = iProductService.updateProduct(productDto);
        return product;
    }


    @PutMapping("/put")
    public ProductEntity updateProduct(@RequestBody ProductDto productDto){
        ProductEntity product = iProductService.updateProduct(productDto);
        return product;
    }


    @DeleteMapping("/del/{id}")
    public void deleteProduct(@PathVariable int id) {
        iProductService.deleteProduct(id);
    }
}
