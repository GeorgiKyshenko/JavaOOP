package _07_ReflectionAndAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

//        Reflection reflection = new Reflection();
//        Class<? extends Reflection> aClass = reflection.getClass();

        System.out.println(clazz);

        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass);

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        //1-ви вариант
        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();
        Object newInstance = constructor.newInstance();
        System.out.println(newInstance);
        //2-ри вариант
        Reflection ref = clazz.getDeclaredConstructor().newInstance();
        System.out.println(ref);

        Method method = clazz.getMethod("getName"); // ако метода "getName" в Reflection класа не приема параметри и тука не се подават след "getName"
        System.out.println(method);
        System.out.println();

        Method[] methods = clazz.getDeclaredMethods();

        TreeSet<Method> getters = filterMethodsBy(methods, "get");

        TreeSet<Method> setters = filterMethodsBy(methods, "set");

        getters.forEach(m -> System.out.printf("%s will return %s%n", m.getName(), m.getReturnType()));

        setters.forEach(m -> System.out.printf("%s and will set field of %s%n", m.getName(), m.getParameterTypes()[0]));

    }

    public static TreeSet<Method> filterMethodsBy(Method[] method, String filter) {
        return Arrays.stream(method)
                .filter(m -> m.getName().contains(filter))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Method::getName))));
    }
}
