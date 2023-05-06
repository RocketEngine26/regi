package com.re.reggie.dto;

import com.re.reggie.entity.Setmeal;
import com.re.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
