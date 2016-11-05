package week5.nested_classes;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class Ship {

    public static class LifeBoat{

        private String name;

        public LifeBoat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("LifeBoat{");
            sb.append("name='").append(name).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public class Engine{

        private String name;

        public Engine(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Engine{");
            sb.append("name='").append(name).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

}
