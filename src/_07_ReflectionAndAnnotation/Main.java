package _07_ReflectionAndAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        System.out.println("1");
        Class<Reflection> clazz = Reflection.class;
//        Reflection reflection = new Reflection();
//        Class<? extends Reflection> aClass = reflection.getClass();
        System.out.println(clazz);

        System.out.println("2");
        //взимане на суперкласа на clazz
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass);

        System.out.println("3");
        //взимане на всички имплементирани интерфейси в clazz
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        System.out.println("4");
        //1-ви вариант взимане на конструктор.
        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();
        Object newInstance = constructor.newInstance();
        System.out.println(newInstance);
        //2-ри вариант
        Reflection ref = clazz.getDeclaredConstructor().newInstance();
        System.out.println(ref);

        System.out.println("5");
        //getConstructors взима всички конструктори в класа, които са публични.
        //getDeclaredConstructors взима всички конструктори без значени от техният modifier access.
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor1 : constructors) {
            System.out.println(constructor1);
        }

        System.out.println("6");
        //взимане на конструктор по неговите параметри.
        Constructor<?> getSpecificConstructor = clazz.getDeclaredConstructor(String.class, String.class, String.class);
        System.out.println(getSpecificConstructor);

        System.out.println("7");
        // взимане на метод с име getName;
        Method method = clazz.getMethod("getName"); // ако метода "getName" в Reflection класа не приема параметри и тука не се подават след "getName"
        System.out.println(method);

        System.out.println("8");
        // взимане на всички методи и ги разделяме в TreeSet на getters and setters.
        Method[] methods = clazz.getDeclaredMethods();

        TreeSet<Method> getters = filterMethodsBy(methods, "get");

        TreeSet<Method> setters = filterMethodsBy(methods, "set");

        getters.forEach(m -> System.out.printf("%s will return %s%n", m.getName(), m.getReturnType()));

        setters.forEach(m -> System.out.printf("%s and will set field of %s%n", m.getName(), m.getParameterTypes()[0]));

        System.out.println("9");
        //взимане на поле/полета в clazz. -> get.Fields = only public fields / getDeclaredFields = all fields
        Field field = clazz.getDeclaredField("webAddress"); // <- така взимаме информация за полето "nickName"

        String fieldName = field.getName(); // взимаме само името на полето "nickName".
        Object fieldType = field.getType(); // взимаме типа на полето "nickName" (String)

        System.out.println(field);
        System.out.println(fieldName);
        System.out.println(fieldType);
        System.out.println();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field1 : fields) {
            System.out.println(field1);
        }
        //Class<Reflection> clazz = Reflection.class; трябва да има декларация на class (направил съм я в началото).
        // този код сетва полето "webAddress" да е достъпно
        Reflection reflection = new Reflection();
        field.setAccessible(true);
        Object value = field.get(reflection);
        field.set(reflection, value);


    }

    public static TreeSet<Method> filterMethodsBy(Method[] method, String filter) {
        return Arrays.stream(method)
                .filter(m -> m.getName().contains(filter))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Method::getName))));
    }
}
