package dev.velasquez.supermarket.persistence.crud;

import dev.velasquez.supermarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Query method
    List<Producto> findByidCategoriaOrderByNombreAsc(int idCategoria);

    // Otra forma
    // @Query(value = "SELECT * FROM products WHERE id_cateroria = ?", nativeQuery = true)
    // List<Producto> getByCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
