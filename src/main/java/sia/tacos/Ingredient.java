package sia.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author yaogangqiang on 2019/9/15.
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
