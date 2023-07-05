package com.inventario.api;

import com.inventario.entities.ProductoEntity;
import com.inventario.exceptions.ApiErrorResponse;
import com.inventario.services.IProductoService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador orquestador de las peticiones
 * @author jonatan.velasco
 */
@RestController
@RequiredArgsConstructor
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ApiErrorResponse[].class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ApiErrorResponse[].class)
})

@RequestMapping("producto")
@Slf4j
public class ProductoController {

    private final IProductoService iProductoService;

    @GetMapping("listAll")
    public ResponseEntity<?> allProduct() {
        return new ResponseEntity(iProductoService.findAllProduct(), HttpStatus.OK);
    }

    @GetMapping("byId/{id}")
    public ResponseEntity<?> getProductoById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(iProductoService.findByIdProduct(id), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<?> insertProduct(@RequestBody ProductoEntity productoEntity) {
        return new ResponseEntity<>(iProductoService.insertProduct(productoEntity), HttpStatus.CREATED);
    }

    @PutMapping("update")
    public ResponseEntity<?> updateInfoProduct(@RequestBody ProductoEntity productoEntity) {
        return new ResponseEntity<>(iProductoService.updateProduct(productoEntity), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteInfoProduct(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(iProductoService.findByIdDeleteProduct(id), HttpStatus.OK);
    }


}

