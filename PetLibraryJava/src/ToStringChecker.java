public class ToStringChecker {

    public static <T> String toStringSupported(T object) {
        String string = "";
        if (object != null) {
            try {
                string = ((T) object).toString();
            } catch (ClassCastException e) {
                System.out.println("Given object doesn't support toString() method");
            }
        }
        return string;
    }

}
