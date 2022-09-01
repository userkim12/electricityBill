public class elecBill {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("=========================");
        double[] elec = {99,150,250,301,450,510};
        for(double electricity: elec){
            double bill = 0;
            if(electricity <= 100) bill = electricity * 60.7;
            else if(electricity > 100 && electricity <= 200){
                bill += 100 * 60.7;
                bill += (electricity-100) * 125.9;
            }
            else if(electricity > 200 && electricity <= 300){
                bill += 100 * 60.7;
                bill += 100 * 125.9;
                bill += (electricity-200) * 187.9;
            }
            else if(electricity > 300 && electricity <= 400){
                bill += 100 * 60.7;
                bill += 100 * 125.9;
                bill += 100 * 187.9;
                bill += (electricity-300) * 280.6;
            }
            else if(electricity > 400 && electricity <= 500){
                bill += 100 * 60.7;
                bill += 100 * 125.9;
                bill += 100 * 187.9;
                bill += 100 * 280.6;
                bill += (electricity-400) * 417.7;
            }
            else if(electricity > 500){
                bill += 100 * 60.7;
                bill += 100 * 125.9;
                bill += 100 * 187.9;
                bill += 100 * 280.6;
                bill += 100 * 417.7;
                bill += (electricity-500) * 670.6;
            }
            System.out.printf(String.format("%.1fkWh의 전기요금은 %.1f원 입니다.\n", electricity, bill));
        }


    }
}
