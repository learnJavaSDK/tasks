package com.ira;

import java.util.ArrayList;

public class ArrayRangeCreator
{
    public int[] createArrayWithOddNumbers(int from, int to)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        return arrayList2Int(result);
    }

    private static int[] arrayList2Int(ArrayList<Integer> source)
    {
        int[] result = new int[source.size()];
        for (int i = 0; i < source.size(); i++) {
            result[i] = source.get(i);
        }
        return result;
    }
}
