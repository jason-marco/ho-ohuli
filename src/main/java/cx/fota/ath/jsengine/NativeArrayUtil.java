package cx.fota.ath.jsengine;

import sun.org.mozilla.javascript.internal.NativeArray;

/**
 * Created by IntelliJ IDEA.
 * User: BPCM
 * Date: 2/23/12
 * To change this template use File | Settings | File Templates.
 */
public class NativeArrayUtil{
    public Integer[] toIntegers(Object o) {
        NativeArray nativeArray = (NativeArray) o;
        Integer[] integers = new Integer[(int) nativeArray.getLength()];
        for (Object o1 : nativeArray.getIds()) {
            int index = (Integer) o1;
            integers[index] = ((Double) nativeArray.get(index, null)).intValue();
        }
        return integers;
    }

    public Double[] toDoubles(Object o) {
        NativeArray nativeArray = (NativeArray) o;
        Double[] doubles = new Double[(int) nativeArray.getLength()];
        for (Object o1 : nativeArray.getIds()) {
            int index = (Integer) o1;
            doubles[index] = (Double) nativeArray.get(index, null);
        }
        return doubles;
    }

    public String[] toStrings(Object o) {
        NativeArray nativeArray = (NativeArray) o;
        String[] strings = new String[(int) nativeArray.getLength()];
        for (Object o1 : nativeArray.getIds()) {
            int index = (Integer) o1;
            strings[index] = String.valueOf(nativeArray.get(index, null));
        }
        return strings;
    }

    public String toString(Object o) {
        return String.valueOf(o);
    }

    public Double toDouble(Object o) {
        return (Double) o;
    }

    public Integer toInteger(Object o) {
        return ((Double) o).intValue();
    }
}
