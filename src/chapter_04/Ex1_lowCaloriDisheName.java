package chapter_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static chapter_04.Dish.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Ex1_lowCaloriDisheName {

    public static void main(String[] args) {

        List<String> lowCaloriDisheNames =
                menu.stream()
                        .filter(d -> d.getCalories() > 300) //칼로리가 300이하인것이고
                        .map(Dish::getName) // 이름을 가져올거야
                        .limit(3)//상위 3개
                        .collect(toList()); //list형식으로
        System.out.println(lowCaloriDisheNames);

//        //켈랙션의 내부 반복
//        List<String> names = new ArrayList<>();
//        for(Dish dish : menu){
//            names.add(dish.getName());
//        }

//        List<String> names = new ArrayList<>();
//        Iterator<String> iterator = names.iterator();
//        while(iterator.hasNext()){
//            Dish dish = iterator.next();
//            names.add(dish.getName());
//        }
//
//        //스트림 내부반복
//        List<String> names2 = menu.stream()
//                .map(Dish::getName)
//                .collect(toList());


        List<String> names2 = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering: " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("maping: " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(toList());
        System.out.println(names2);


    }

}
