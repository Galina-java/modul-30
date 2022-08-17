public class Person {
    public static boolean isTeenager(int age)
{
    boolean result;
    if (age <= 19 && age >= 13) {
        result = true;
    }
    else {
        result = false;
    }
    return result;
}
}
