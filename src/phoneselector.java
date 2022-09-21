import java.nio.BufferOverflowException;
import java.util.*;

public class phoneselector {

//Arrayslist [id,merk,type,omschrijving,prijs]
    static ArrayList<Object> mobiellist1 = new ArrayList<Object>(Arrays.asList(1, "Huawei", "P30", "6.47\" FHD+ (2340x1080) OLED, Kirin 980 Octa-Core (2x Cortex-A76 2.6GHz+ 2x Cortex-A76 1.92GHz + 4x Cortex-A55 1.8GHz), 8GB RAM, 128GB ROM,40+20+8+TOF/32MP, Dual SIM, 4200mAh, Android 9.0 + EMUI 9.1",697));
    static ArrayList<Object> mobiellist2 = new ArrayList<Object>(Arrays.asList(2, "Samsung","GalaxyA52","64 megapixel camera, 4k videokwaliteit 6.5 inch AMOLED scherm 128 GBopslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig(IP67)",399));
    static ArrayList<Object> mobiellist3 = new ArrayList<Object>(Arrays.asList(3, "Apple","IPhone11","Met de dubbele camera schiet je in elke situatie een perfecte foto of videoDe krachtige A13-chipset zorgt voor razendsnelle prestaties Met Face IDhoef je enkel en alleen naar je toestel te kijken om te ontgrendelen Hettoestel heeft een lange accuduur dankzij een energiezuinige processor",619));
    static ArrayList<Object> mobiellist4 = new ArrayList<Object>(Arrays.asList(4, "Google","Pixel4a","12.2 megapixel camera, 4k videokwaliteit 5.81 inch OLED scherm 128 GBopslaggeheugen 3140 mAh accucapaciteit",411));
    static ArrayList<Object> mobiellist5 = new ArrayList<Object>(Arrays.asList(5, "Xiaomi","RedmiNote10 Pro","108 megapixel camera, 4k videokwaliteit 6.67 inch AMOLED scherm 128GB opslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig(IP53)",298));


    static HashMap<Integer,ArrayList<Object>> kaas = new HashMap<Integer,ArrayList<Object>>();

    //    //adding values in the dictionary
//    dict.put(101, "Sydney");
//    dict.put(102, "Brisbane");


    public static void Guess() {
        kaas.put(1,mobiellist1);
        kaas.put(2,mobiellist2);
        kaas.put(3,mobiellist3);
        kaas.put(4,mobiellist4);
        kaas.put(5,mobiellist5);


        System.out.println("Raad het getal! (tussen 1 en 5)");
        Scanner in = new Scanner(System.in);

        int userInput = 2;
        //int guess2 = in.nextInt();
//        while (guess != secretNumber) {
//            System.out.println("fout antwoord");
//            guess = in.nextInt();
//        }

        while (true) {
            for(int selectie=0; selectie < kaas.size(); selectie++){
                //System.out.println(selectie);
                System.out.println(kaas.get(selectie+1).get(0)+ " "+kaas.get(selectie+1).get(1)+ " "+kaas.get(selectie+1).get(2));
            }

            System.out.println("Type a natural number:");

            try {
                userInput = Integer.parseInt(in.next());
                System.out.println("je nummer was" + userInput);
                if (userInput < 0) {
                    throw new ArithmeticException("negatief!");}
                if (userInput >= kaas.size()+1){
                    throw new BufferOverflowException();}
                for(int emptyLines=0; emptyLines < 6; emptyLines++){
                    System.out.println("");
                }
                System.out.print(kaas.get(1).get(1)+ " ");
                System.out.print(kaas.get(1).get(2)+" ");
                System.out.println(kaas.get(1).get(4)+" ");
                System.out.println(kaas.get(1).get(3));

                System.out.println("druk op een toests om terug te gaan");
                userInput = Integer.parseInt(in.next());
                for(int emptyLines=0; emptyLines < 6; emptyLines++){
                    System.out.println("");
                }

//                break; // breaks out of the loop, do not remove fully
            } catch (NumberFormatException ignore) {
                System.out.println("voer alleen getallen ");
            } catch (ArithmeticException ignore){
                System.out.println("negatief ");
            } catch (BufferOverflowException ignore){
                System.out.println("veel te groot getal ");
            }
        }
        //System.out.println("gewonnen");
    }






}
