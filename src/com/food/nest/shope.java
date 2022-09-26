//package com.food.nest;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class shope {
//
//    public static void main(String[] args) {
//        int mode,choice,qty;
//
//        ArrayList itemName = new ArrayList<>();
//        ArrayList qunatity = new ArrayList<>();
//        ArrayList price = new ArrayList<>();
//        Food dineIn = new Food(6,5, 10);
//        Food takeAway = new Food(7, 6, 11);
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Select mode");
//        System.out.println("1. DineIn");
//        System.out.println("2. Takeaway");
//        System.out.println("3. Exit");
//        mode = in.nextInt();
//        switch (mode){
//            case 1:
//                while(true){
//
//                    System.out.println("Select an Option: ");
//                    System.out.println("1. Cake :"+dineIn.getCake());
//                    System.out.println("2. Dosa :"+dineIn.getDosa());
//                    System.out.println("3. Juice :"+dineIn.getJuice());
//                    System.out.println("4. Bill");
//                    System.out.println("5. Exit");
//
//                    choice = in.nextInt();
//                    switch (choice){
//
//                        case 1:
//                            System.out.println("Enter the qty");
//                            qty = in.nextInt();
//                            itemName.add("Dosa");
//                            qunatity.add(qty);
//                            price.add(qty* dineIn.getDosa());
//                            break;
//                        case 2:
//                            System.out.println("Enter the qty");
//                            qty = in.nextInt();
//                            itemName.add("cake");
//                            qunatity.add(qty);
//                            price.add(qty* dineIn.getCake());
//                            break;
//                        case 3:
//                            System.out.println("Enter the qty");
//                            qty = in.nextInt();
//                            itemName.add("juice");
//                            qunatity.add(qty);
//                            price.add(qty*dineIn.getJuice());
//                            break;
//
//                        case 7:
//                            System.out.println("******************");
//                            System.out.println("Item Qty Price");
//                            int sum = 0;
//                            for (int i = 0; i <= itemName.size()-1; i++) {
//                                System.out.println(itemName.get(i)+" "+qunatity.get(i)+" :"+price.get(i));
//                                sum += price.get(i);
//                            }
//                            System.out.println("Total is "+sum);
//                            sum=0;
//                            System.exit(0);
//                        case 8:
//                            System.exit(0);
//                        default:
//                            System.out.println("Invalid Choice");
//                            break;
//                    }
//                }
//            case 2:
//                while(true){
//
//                    System.out.println("Select an Option: ");
//                    System.out.println("1. Juice :"+takeAway.getJuice());
//                    System.out.println("2. Cake :"+takeAway.getCake());
//                    System.out.println("3. dosa :"+takeAway.getDosa());
//                    System.out.println("4. Bill");
//                    System.out.println("5. Exit");
//
//                    choice = in.nextInt();
//                    switch (choice){
//
//                        case 1:
//                            System.out.println("Enter the qty");
//                            qty = in.nextInt();
//                            itemName.add("Juice");
//                            qunatity.add(qty);
//                            price.add(qty*takeAway.getJuice());
//                            break;
//                        case 2:
//                            System.out.println("Enter the qty");
//                            qty = in.nextInt();
//                            itemName.add("cake");
//                            qunatity.add(qty);
//                            price.add(qty* takeAway.getCake());
//                            break;
//                        case 3:
//                            System.out.println("Enter the qty");
//                            qty = in.nextInt();
//                            itemName.add("Dosa");
//                            qunatity.add(qty);
//                            price.add(qty* takeAway.getDosa());
//                            break;
//
//                        case 7:
//                            System.out.println("******************");
//                            System.out.println("Item Qty Price");
//                            int sum = 0;
//                            for (int i = 0; i <= itemName.size()-1; i++) {
//                                System.out.println(itemName.get(i)+" "+qunatity.get(i)+" :"+price.get(i));
//                                sum += price.get(i);
//                            }
//                            System.out.println("Total is "+sum);
//                            sum=0;
//                            System.exit(0);
//                        case 8:
//                            System.exit(0);
//                        default:
//                            System.out.println("Invalid Choice");
//                            break;
//                    }
//                }
//            case 3:
//                System.exit(0);
//        }
//
//    }
//}
