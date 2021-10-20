package jpastudy.jpashop.web;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class BookForm {
    private Long id;
    @NotBlank(message = "상품명은 필수 항목입니다.")
    private String name;
    private int price;
    @Min(value = 1, message = "최소 재고 수량은 1개 입니다.")
    private int stockQuantity;
    private String author;
    private String isbn;
}