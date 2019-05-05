package four_reflect.ten_generic_erasure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericHelper {

    public static Class<?> getParameterizedTypeOfSuperclass(Class<?> clazz) {
        Type type = clazz.getGenericSuperclass();
        if(type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            Type[] types = pt.getActualTypeArguments();
            return (Class<?>) types[0];
        }
        return null;
    }
}
