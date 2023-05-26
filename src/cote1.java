import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class cote1 {
    public static void main(String[] args) {

        //1번 문제
        //String 타입의 문자열을 받았을 때 문자열을 반대로 출력하는 로직
        //ex) input -> telephone  output -> enohpelet

        String cap = "telephone";
        String[] capArr = cap.split("");
        String[] reArr = new String[capArr.length];

        for (int i = capArr.length - 1, j = 0; i >= 0; i--, j++) {
            reArr[j] = capArr[i];
        }

        String reStr = String.join("", reArr);

        System.out.println("1번 " + reStr);



        //2번 문제
        //문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

        String plant = "monstera";

        String first = plant.substring(0, 1);
        String end = plant.substring(plant.length()-1);
        String add = first.concat(end);

        System.out.println("2번 " + add);


        //3번 문제
        //영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
        //단 앞 뒤에 공백이 붙어 있을 수도 있다
        //ex) Hello my name is Je   ----> 5 / My leg  ----> 2

        String blank = " Hello my name is Je ";
        String blankTrim = blank.trim();
        String[] wordArr = blankTrim.split(" ");
        int countWord = wordArr.length;
        System.out.println("3번 " + countWord);

        //4번 문제
        //알파벳 소문자로 이루어진 N개의 단어가 들어오면 길이가 짧은 것부터 길이가 같으면 사전 순으로 정렬하는 프로그램을 작성하시오
        //단, 같은 단어가 있을 경우 삭제한다.
        //ex)[apple, rose, hat , hat ,civilization, yes] -> [hat,yes ,rose , apple , civilization]

        String[] group = {"apple", "rose", "hat" , "hat" ,"civilization", "yes"};

        // 길이 오름차순 정렬
        //Arrays.sort(group, (String s1, String s2) -> s1.length() - s2.length());
        Arrays.sort(group, Comparator.comparingInt(String::length));
        // 알파벳순 정렬
        Arrays.sort(group);
        System.out.println("4번 정렬 " + Arrays.toString(group));

        List<String> strList = new ArrayList<>(Arrays.asList(group));

        // 중복 삭제
        for (int i=0; i < strList.size(); i++) {
            for (int j=i+1; j < strList.size(); j++) {
                if (strList.get(i).equals(strList.get(j))) {
                    strList.remove(i);
                }
            }
        }

        System.out.println("4번 " + strList.toString());






        //5번 문제
        //알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

        String abc = "baobob";

        int abcLength = abc.length();
        System.out.println("5번 " + abcLength);





    }

}