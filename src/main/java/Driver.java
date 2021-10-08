import dependencyInjection.DependentClass;
import dependencyInjection.NeedyClass;
import factory.Cake;
import factory.Dessert;
import factory.DessertFactory;
import serialization.SerializableClass;

import java.io.*;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String... args) throws IOException, ClassNotFoundException {

        //SerializableClass obj = new SerializableClass(5, "This is serializable!");
        //ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("serial"));
        //outStream.writeObject(obj);

        ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("serial"));
        SerializableClass newObj = (SerializableClass) inStream.readObject();
        System.out.println("Our Object's data: " + newObj.getI() + ", " + newObj.getS());


        Cake cake = (Cake)DessertFactory.getDessert("cake");
        System.out.println("Tonight's dessert is: " + cake.getType());

        NeedyClass myNeedyClass = new NeedyClass(new DependentClass("Hello!"));

        double money = 100.1;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        System.out.println("money: " + moneyString);




        int x = 5;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);


        List<Integer> myList = new ArrayList<>();

        if(myList instanceof List) {
            System.out.println("instance of yes");
        }




        if(true && false) {
            System.out.println("true");
        }




        // These
        int y;
        if(x == 7) {
            y = 7;
        } else {
            y = 1;
        }

        y = (x == 7) ? 7 : 1;




        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");


        if(str1 == str2) {
            System.out.println("1 & 2 are equal");
        }
        if(str1 == str3) {
            System.out.println("1 & 3 are equal");
        } else {
            System.out.println("1 & 3 are not equal");
        }

        //here we see the difference between == and .equals.
        //== check the references are the same (0x441b3f == 0x441b3f)
        //.equals() checks if the contents are the same ("test" == "test")
        if(str1.equals(str3)) {
            System.out.println("str1.equals(str3)");
        }

        //let's add str3 to the string pool
        str3 = str3.intern();


        if(str1 == str3) {
            System.out.println("1 & 3 are equal");
        } else {
            System.out.println("1 & 3 are not equal");
        }

        String splitMe = "This is a string isn't it?";
        StringTokenizer tokenizer = new StringTokenizer(splitMe, " ");


        String[] tokens = splitMe.split(" a ");



        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }


    }
}
