public class Main {
    public static void main(String[] args) {

// case 1.1
        System.out.println("case 1.1");

        int cash = 29000;
        int total = 0;
        int i=0;
               while (total <= 2_459_000) {
            i++;
            total=total+cash;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ total+ " рублей");
        }

// case 1.2
        System.out.println("case 1.2");
        int f=0;
        while (f < 10) {
            f++;
            System.out.print(f+" ");
        }
        System.out.println();

            for (int k=10; k > 0; k--) {
            System.out.print(k+ " ");
            }
        System.out.println();

// case 1.3
        System.out.println("case 1.3");
int populationY = 12_000_000;
int population = 17-8;
int populationGrowth = populationY/1000*population;
int populationSize =0;
for (int x = 1; x <= 10; x++) {
    populationSize = populationSize +populationGrowth+populationY;
    System.out.println("Год " + x + ", численность населения составляет " + populationSize);
}

// case 2.1
        System.out.println("case 2.1");
int initialAmount = 15_000;
int percentPerMonth=initialAmount*7/100;
        for (int z = 1; initialAmount <= 12_000_000; z++) {
        initialAmount = initialAmount +percentPerMonth;
        System.out.println("Месяц " + z + ", сумма накоплений равна " + initialAmount + " рублей");
        }

// case 2.2
        System.out.println("case 2.2");
        int initialAmount1 = 15_000;
        int percentPerMonth1 = initialAmount1 *7/100;
        for (int z = 1; initialAmount1 <= 12_000_000; z++) {
            initialAmount1 = initialAmount1 + percentPerMonth1;
            if (z % 6 == 0) {
                System.out.println("Месяц " + z + ", сумма накоплений равна " + initialAmount1 + " рублей");
            }
        }

// case 2.3
        System.out.println("case 2.3");
        int initialSum = 15000;
        int percent = initialSum *7/100;
        int month = 9*12; // 9 лет переводим в месяцы
                for (int t = 1; t <= month; t++ ) {
            initialSum=initialSum+percent;
            if (t % 6 == 0) {
                System.out.println("Месяц " + t + ", сумма накоплений равна " + initialSum + " рублей");
            }
        }
// case 2.4
        System.out.println("case 2.4");
        int friday = 3; // пятница 3е число месяца
        int m =31;      // число дней в месяце
        for (int p = friday; p <= m; p=p+7) {
            friday= friday+7;
            System.out.println("Сегодня пятница, "+ p +"-е число. Необходимо подготовить отчет.");
        }

// case 3.1
        System.out.println("case 3.1");

            for (int q = 1896; q <= 2122; q= q + 79) {
            System.out.println("В " + q +" году комета пролетает рядом с Землей");
        }

// case 3.2
        System.out.println("case 3.2");
        int num = 2;
        for (int r=1; r <= 10; r++) {
            System.out.println (num + "*" +r+"="+num*r);
        }
    }
    }