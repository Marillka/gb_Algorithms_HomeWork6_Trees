import java.util.concurrent.ThreadLocalRandom;

public class Main {

    /**
     * 1. Создать и запустить программу для построения двоичного дерева. В цикле построить двадцать деревьев с глубиной в 4 уровней. Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int. Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -25 до 25.
     * 2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
     */

    public static void main(String[] args) {
        homework();

    }

    public static void homework() {
        int countOfTrees = 20;

        int balanced = 0;
        for (int i = 0; i < countOfTrees; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            fillTreeMap(map);
            if (map.isBalanced()) {
                balanced++;
            }
        }
        System.out.println("Из " + countOfTrees + " MyTreeMap сбалансированы " + balanced + "\r\nнесбалансированы " + (countOfTrees - balanced) + " деревьев");
        System.out.println("Несбалансированы " + ((((float) (countOfTrees - balanced)) * 100) / (float) countOfTrees) + " %");
    }

    private static void fillTreeMap(MyTreeMap<Integer, Integer> MyTreeMap) {
        while (MyTreeMap.height() < 6) {
            MyTreeMap.put(ThreadLocalRandom.current().nextInt(-25, 25), 0);
        }
    }
}

