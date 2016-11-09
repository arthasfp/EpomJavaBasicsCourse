package hw5;

/**
 * Created by Sergii on 08.11.2016.
 */
public enum Gender {
    MALE(1, "Чоловік") {
        @Override
        public void getFavoriteBehavior() {
            System.out.println("Грати в відеоігри");
        }
    },
    FEMALE(2, "Жінка") {
        @Override
        public void getFavoriteBehavior() {
            System.out.println("Фарбуватися");
        }
    };

    private int id;
    private String title;

    Gender(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract void getFavoriteBehavior();
}
