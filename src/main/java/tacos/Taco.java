package tacos;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;


    //@Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients  = new ArrayList<>();

    public void setIngredients(@RequestParam("ingredients") List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}