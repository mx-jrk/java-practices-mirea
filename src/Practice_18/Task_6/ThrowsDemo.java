package Practice_18.Task_6;

public class ThrowsDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return null;
        }
    }
}

