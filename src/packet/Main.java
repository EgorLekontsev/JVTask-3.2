package packet;
public class Main {
	public static void main(String[] args) {
		String s1 ="Java is impossible?"; //Объявляем и инициализируем разные варианты строк
		String s2 ="A Toyota!"; 
		System.out.println("Строка '"+s1+"' является палиндромом? "+Palindrome(s1));
		System.out.println("Строка '"+s2+"' является палиндромом? "+Palindrome(s2));
	}
	public static String Palindrome(String str) {//Прогоняем наши строки в методе
		str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");//Преобразуем буквы в нижний регистр и игнорируем знаки
        int left = 0; //инициализируем переменные, которые будут являтся индексами в нашей строке
        int right = str.length() - 1;
        while (left < right) { //Проверям символы с двух сторон
            if (str.charAt(left) != str.charAt(right)) {
                return "Нет"; //Нашли отличающиеся символы
            }
            left++; //Изменяем индексы на следующую итерацию
            right--;
        }
        return "Да";
    }
}
