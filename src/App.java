import java.util.ArrayList;
import java.util.List;

import Control.Controller;
import Control.iGetModel;
import Control.iGetView;
import Model.Animal;
import Model.AnimalList;
import Model.Cat;
import Model.Dog;
import Model.Donkey;
import Model.Mull;
import View.View;

public class App {
    public static void main(String[] args)  {

       List< Animal>  animals = new ArrayList< Animal>();
       Animal a1 = new Cat("Сергей",  21, 101, "домашний");
       Animal a2 = new Dog("Андрей",  22, 111, "домашний");
       Animal a3 = new Donkey("Иван", 22, 121, "вьючный");
       Animal a4 = new Mull("Игорь", 23, 301, "вьючный");
       Animal a5 = new Cat("Даша",  25, 171, "домашний");
       Animal a6 = new Dog("Лена",  23, 104, "домашний");

       animals.add(a1);
       animals.add(a2);
       animals.add(a3);
       animals.add(a4);
       animals.add(a5);
       animals.add(a6);

       iGetModel model = new AnimalList(animals);
       iGetView view = new View();
       Controller control = new Controller(model, view);
       control.run();
    }
}