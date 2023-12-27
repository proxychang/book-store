package com.app.bookstore.dto.shopping.cart;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ShoppingCartRequestDto {
    private Long bookId;
    @Positive
    private Integer quantity;
}
