import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id;
        String result = "対象のデータは存在しません。";

        // 犬のリストを作成
        List<Dog> dogs = List.of(
                new Dog(1,"ポチ", 3, "柴犬"),
                new Dog(2,"ハチ", 5, "秋田犬"),
                new Dog(3,"マサル", 4, "秋田犬"),
                new Dog(4,"パトラッシュ", 7, "セントバーナード")
        );

        //拡張for文で登録されている犬情報を表示
        for(Dog dog: dogs){
            System.out.println(dog.getId() + "：" + dog.getName());
        }

        // コンソールでID入力受付
        Scanner sc = new Scanner(System.in);
        System.out.println("詳細表示したい犬のID番号を入力して下さい。");

        // 整数が入力されるまで繰り返す
        while(true) {
            try {
                id = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ID番号は整数を入力して下さい。");
                sc.nextLine();
            }
        }
        sc.close();

        // 検索結果用メッセージ作成
        for(Dog dog: dogs){
            if(dog.getId() == id){
                result = dog.getName() + "は" + dog.getAge() + "歳の" + dog.getBreed() + "です。";
            }
        }

        // 検索結果表示
        System.out.println(result);

    }
}
