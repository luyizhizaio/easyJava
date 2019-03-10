package com.kyrie.datastructure.struct;

/**
 * Created by Kyrie on 2017/7/18.
 * ���Ա����飩����������������ֵ������
 * ����Ԫ�أ���Ҫ��index�������������ƶ���Ȼ��ֵ����indexλ�ã�ɾ���򽫺����ֵ������ǰ�ƶ�
 */
public class Array {

    public static void main(String[]args){

        int value[] = new int[10];
        for(int i =0; i < 10; i++){
            value[i] = i;
        }

        traverse(value);

        //�±�Ϊ3��λ�ò���һ��Ԫ��
        int[] newValue = insert(value,8,3);

        traverse(newValue);

        //ɾ��
        int[] newValue2 = delete(value,3);
        traverse(newValue2);
        //����
        int index = findElem(value,3);
        System.out.println("index=" + index);
    }

    /**
     * ����
     * @param arr
     * @param e
     * @return
     */
    public static int findElem(int[] arr,int e){

        int i ;
        for(i =0; i< arr.length;i++){
            if(e == arr[i]){
                return i;
            }
        }
        return -1;

    }


    /**
     * ָ��λ�ò���Ԫ��
     * @param old
     * @param value
     * @param index
     * @return
     */
    public static int[] insert(int[] old , int value,int index){

        //
        for(int k = old.length-1; k>index; k--) {

            old[k] = old[k - 1];
        }
            old[index] = value;
            return old;

    }

    public static int[] delete(int[] old , int index){
        for(int h =index; h<old.length -1 ;h++){
            old[h] = old[h+1];
        }
        old[old.length -1] = 0;
        return old;
    }


    /**
     * ��ӡԪ��
     * @param data
     */
    public static void traverse(int data[]){
        System.out.println(" ");
        for (int i =0; i < data.length; i++)
            System.out.print(data[i] +" ");

    }


}
