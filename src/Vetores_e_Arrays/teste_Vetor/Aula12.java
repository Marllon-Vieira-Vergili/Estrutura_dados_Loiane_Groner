package Vetores_e_Arrays.teste_Vetor;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {


        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("A");
        arraylist.add("C");


        System.out.println(arraylist);

        arraylist.add(1, "B");
        System.out.println(arraylist);

        boolean existe = arraylist.contains("A");
        if (existe == true){
            System.out.println("Elemento existe no array");
        }
        else{
            System.out.println("Elemento não existe no array!");
        }
        int pos = arraylist.indexOf("B");
        if (pos > -1){
            System.out.println("Elemento existe no array!" + pos);
        }
        else{
            System.out.println("Elemento não existe no array!" + pos);

        }

        System.out.println(arraylist.get(2));
        arraylist.remove(0);
        arraylist.remove("C");

        System.out.println(arraylist);

        System.out.println(arraylist.size());
    }

}
