package week3.builder;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class TestBuilder {

    public static void main(String[] args) {

        Milk.Builder builder = new Milk.Builder().setName("Agusha").setColor(333).setE(235).setCarbohydrates(15)
        .setFats(50);

        Milk milk = builder.setProteins(13).setVitamins(1).setVolume(900).build();
    }

}
