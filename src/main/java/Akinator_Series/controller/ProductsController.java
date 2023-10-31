package Akinator_Series.controller;


import Akinator_Series.DTOS.ProductsDTO;
import Akinator_Series.models.ProductsModels;
import Akinator_Series.service.ProductsServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3500)
@RestController
@Controller
@RequestMapping (value="/api")
public class ProductsController {

    @Autowired
    ProductsServices productsServices;

    public ProductsController(ProductsServices productsServices) {
        this.productsServices = productsServices;
    }

    @GetMapping("/produtos")
    public List<ProductsModels> verificarLista() {
        List<ProductsModels> productsModels = productsServices.produtosListados();
        return productsModels;

    }

    @PostMapping(value = "/inserir")
    public ResponseEntity<Object> saveProductModels (@RequestBody @Valid ProductsDTO productsDTO){
        var productsModels = new ProductsModels ();
        BeanUtils.copyProperties(productsDTO, productsModels);
        return ResponseEntity.status(HttpStatus.CREATED).body(productsServices.save(productsModels));
 }
}
