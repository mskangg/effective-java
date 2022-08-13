package me.whiteship.chapter01.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했다. (17~18쪽)
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFactsLombok {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFactsLombok cocaCola = NutritionFactsLombok.builder()
                .servingSize(240)
                .servings(8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
