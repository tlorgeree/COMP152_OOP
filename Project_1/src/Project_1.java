import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;

public class Project_1 {
    public static void main (String[] args)throws IOException {
        String[] txt_list;

        var fileName = "Project_1.txt";
        String all_names = Files.readString(Paths.get(fileName));
        txt_list = all_names.split("\n");

        var _max = txt_list.length;
        System.out.println(_max);
        String[] item_name = new String[_max];
        float[] item_price = new float[_max];
        int[] item_stock = new int[_max];

        for (var i = 0; i < _max; i++)
        {
            String[] item = txt_list[i].split(",");
            System.out.println(item[2]);
            item_name[i] = item[0];
            item_price[i] = Float.parseFloat(item[1]);
            item_stock[i] = parseInt(item[2].trim());
        }

       for (var j = 0; j< _max; j++)
           System.out.println(item_name[j] + ", " + item_price[j] + ", " + item_stock[j]);



    }


}
