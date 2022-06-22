public class Main {
    public static void main(String[] args){
        // входные данные
      int customer = 100;
      int refill = 1639;
        // логика программы
        int bonus;
        int sum;
        if  (refill > 1000){
            bonus = refill / 100 ;
            sum = customer + refill + bonus;
            System.out.println("Бонус равен " + bonus + " рублям");
            System.out.println("Итоговая сумма на счету клиента " + sum);
        }else{
           sum = customer + refill;
           System.out.println("Бонуса нет, итоговая сумма на счету клиента " + sum);
        }
    }
}
