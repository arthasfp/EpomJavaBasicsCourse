package hw5;

/**
 * Created by Sergii on 08.11.2016.
 */
public enum Gender {
    MALE(1, "Чоловік") {
        @Override
        public void getFavoriteBehavior() {
            System.out.println("Пить пиво і дивиться футбол");
        }
    },
    FEMALE(2, "Жінка") {
        @Override
        public void getFavoriteBehavior() {
            System.out.println("Вишивать шрестиком і варить борщ");
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
