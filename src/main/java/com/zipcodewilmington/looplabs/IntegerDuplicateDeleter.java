package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer max = 0;
        for(Integer x : array){
            if(x == null) continue;
            if(x > max) max = x;
        }
        int[] counts = new int[max + 1];
        for(Integer x : array){
            if(x == null) continue;
            counts[x] += 1;
        }
        for(int i = 0; i < counts.length; i++){
            if(counts[i] >= maxNumberOfDuplications){
                for(int j = 0; j < array.length; j++){
                    if(array[j] == null) continue;
                    if(i == array[j]) array[j] = null;
                }
            }
        }
        Integer nullCount = 0;
        for(Integer x : array){
            if(x == null) nullCount++;
        }
        Integer[] ans = new Integer[array.length - nullCount];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j] != null){
                    ans[i] = array[j];
                    array[j] = null;
                    break;
                }
            }
        }
        return ans;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer max = 0;
        for(Integer x : array){
            if(x == null) continue;
            if(x > max) max = x;
        }
        int[] counts = new int[max + 1];
        for(Integer x : array){
            if(x == null) continue;
            counts[x] += 1;
        }
        for(int i = 0; i < counts.length; i++){
            if(counts[i] == exactNumberOfDuplications){
                for(int j = 0; j < array.length; j++){
                    if(array[j] == null) continue;
                    if(i == array[j]) array[j] = null;
                }
            }
        }
        Integer nullCount = 0;
        for(Integer x : array){
            if(x == null) nullCount++;
        }
        Integer[] ans = new Integer[array.length - nullCount];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j] != null){
                    ans[i] = array[j];
                    array[j] = null;
                    break;
                }
            }
        }
        return ans;
    }
}
