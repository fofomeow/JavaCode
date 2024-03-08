

package com.mycompany.fofparty;
import java.util.Scanner; // for let user input 

public class Fofparty { // class name
private static Scanner input = new Scanner(System.in); // for input
    public static void main(String[] args) { // main 
 
        String name; // difinition for name
        System.out.println("enter your name please"); // output for name
        name = input.nextLine(); // user write it
        int phonenumber; //user number
        System.out.println("enter your phone number ");// to ask him for his number
        phonenumber = input.nextInt(); // user write it
        int x;
        System.out.println("choose one service by using numbers"); // write number of service
        System.out.println("1- BIRTHDAY PARTY"); // first main service
        System.out.println("2- DINNER PARTY"); // second main service
        System.out.println("3- GRADUATION PARTY"); // third main service
        x = input.nextInt();
        int price; // difinition price
        price = 0; // equal zero 
        if (x == 1) {
            int loop = 0; 
            do {
                int cake; // difinition
                int gift;
                int song;
                int y;
                System.out.println("choose by using numbers");// write number of service
                System.out.println("1-CAKE"); // first
                System.out.println("2-GIFT"); // second
                System.out.println("3-SONGS"); // third
                y = input.nextInt(); //  write number
                if (y == 1) { // to select first
                    int c1; // when he select 1
                    System.out.println("choose by using numbers");// write number of service
                    System.out.println("1- CHOCOLATE"); //  first
                    System.out.println("2-VANILLA"); // second one
                    c1 = input.nextInt(); 
                    if (c1 == 1) {
                        System.out.println("500"); // price = 500
                        price = price + 500; // here we have summation
                    } else {
                        if (c1 == 2) {
                            System.out.println("500"); // price = 500
                            price = price + 500; // summation
                        }
                    }
                    System.out.println(" do you want another service");// write 1 if he want another service
                    System.out.println("1- yes"); // if he want another
                    System.out.println("2- no"); // if he done
                    loop = input.nextInt();
                } else {
                    if (y == 2) {
                        int smartdevice; // difinition
                        int pet;
                        int watch;
                        int z;
                        System.out.println("choose by using numbers");// write number of service
                        System.out.println("1- SMART DEVICE"); // first one
                        System.out.println("2-PET"); // second
                        System.out.println("3- WATCH");
                        z = input.nextInt();
                        if (z == 1) {
                            System.out.println("choose by using numbers");// write number of service
                            System.out.println("1-IPAD"); // first
                            System.out.println("2-IPHONE"); //second
                            gift = input.nextInt();
                            if (gift == 1) {
                                System.out.println("5000"); // price = 5000
                                price = price + 5000; // summation
                            } else {
                                if (gift == 2) {
                                    System.out.println("5000"); // price = 5000
                                    price = price + 5000; //summation
                                }
                            }
                            System.out.println(" do you want another service");// write 1 if he want another service
                            System.out.println("1- yes");// if he want another
                            System.out.println("2- no"); //if he dont want
                            loop = input.nextInt();
                        } else {
                            if (z == 2) {
                                System.out.println("choose by using numbers");// write number of service
                                System.out.println("1-CAT"); // first ( i write this cause i love cats soo muchh)
                                System.out.println("2-RABBIT"); // second
                                pet = input.nextInt();
                                if (pet == 1) {
                                    System.out.println("800"); // price =800
                                    price = price + 800; //summation
                                } else {
                                    if (pet == 1) {
                                        System.out.println("300"); // price = 300
                                        price = price + 300; //summation
                                    }
                                }
                                System.out.println(" do you want another service");// write 1 if he want another service
                                System.out.println("1- yes");// if he want another
                                System.out.println("2- no"); // if he done
                                loop = input.nextInt();
                            } else {
                                if (z == 3) {
                                    System.out.println("choose by using numbers");// write number of service
                                    System.out.println("1- APPLE WATCH 3"); // first
                                    System.out.println("APPLE WATCH 6"); // second
                                    song = input.nextInt();
                                    if (song == 1) {
                                        System.out.println("1000"); // price = 1000
                                        price = price + 1000; //summation
                                    } else {
                                        if (song == 2) {
                                            System.out.println("2000"); // price = 2000
                                            price = price + 2000; //summation
                                        }
                                    }
                                    System.out.println(" do you want another service");// write 1 if he want another service
                                    System.out.println("1- yes");// if he want another
                                    System.out.println("2- no"); // if he done
                                    loop = input.nextInt(); // for write number 
                                }
                            }
                        }
                    } else { // if he write 2
                        if (y == 3) {
                            int english;
                            int arabic;
                            int f;
                            System.out.println("choose by using numbers");// write number of service
                            System.out.println("1- ENGLISH SONGS"); // first
                            System.out.println("2- ARABIC SONGS"); // second
                            f = input.nextInt();
                            if (f == 1) {
                                System.out.println("200"); // price =200
                                price = price + 200; //summation
                            } else {
                                if (f == 2) {
                                    System.out.println("200"); // price = 200
                                    price = price + 200; //summation
                                }
                            }
                        }
                        System.out.println(" do you want another service");// write 1 if he want another service
                        System.out.println("1- yes");// if he want another
                        System.out.println("2- no"); // if he dont
                        loop = input.nextInt();
                    }
                }
            }
            while (loop == 1);// loop if he want come back and select other things
        } else {
            if (x == 2) {
                int loop2 = 0;
                do {
                    int meat;
                    int chicken;
                    int fish;
                    int extra;
                    int a;
                    System.out.println("choose by using numbers");// write number of service
                    System.out.println("1- MEAT"); // first
                    System.out.println("2-CHICKEN"); // second
                    System.out.println("3- FISH"); // third
                    System.out.println("4-EXTRA"); // extra
                    a = input.nextInt();
                    if (a == 1) {
                        int whiterice;
                        int redrice;
                        int b;
                        System.out.println("choose by using numbers");// write number of service
                        System.out.println("1- WHITE RICE"); // first
                        System.out.println("1- RED RICE"); // second
                        b = input.nextInt();
                        if (b == 1) {
                            System.out.println("100"); // price = 100
                            price = price + 100; //summation
                        } else {
                            if (b == 2) {
                                System.out.println("100");// price = 100
                                price = price + 100; //summation
                            }
                        }
                        System.out.println(" do you want another service"); // write 1 if he want another service
                        System.out.println("1- yes");// if he want another
                        System.out.println("2- no"); // if he done
                        loop2 = input.nextInt();
                    } else {
                        if (a == 2) {
                            int whiterice;
                            int redrice;
                            int c;
                            System.out.println("choose by using numbers");// write number of service
                            System.out.println("1- WHITE RICE"); // first
                            System.out.println("2- RED RICE"); // second
                            c = input.nextInt();
                            if (c == 1) {
                                System.out.println("100");// price = 100
                                price = price + 100; //summation
                            } else {
                                if (c == 2) {
                                    System.out.println("100");// price = 100
                                    price = price + 100; //summation
                                }
                            }
                            System.out.println(" do you want another service");// write 1 if he want another service
                            System.out.println("1- yes");// if he want another
                            System.out.println("2- no"); // if he done
                            loop2 = input.nextInt();
                        } else {
                            if (a == 3) {
                                int whiterice;
                                int redrice;
                                int d;
                                System.out.println("choose by using numbers");// write number of service
                                System.out.println("1- WHITE RICE"); // first
                                System.out.println("2- RED RICE"); // second
                                d = input.nextInt();
                                if (d == 1) {
                                    System.out.println("100");// price = 100
                                    price = price + 100; //summation
                                } else {
                                    if (d == 2) {
                                        System.out.println("100");// price = 100
                                        price = price + 100; //summation
                                    }
                                }
                                System.out.println(" do you want another service");// write 1 if he want another service
                                System.out.println("1- yes");// if he want another
                                System.out.println("2- no"); // if he done
                                loop2 = input.nextInt();
                            } else {
                                if (a == 4) {
                                    int salad;
                                    int juice;
                                    int e;
                                    System.out.println("choose by using numbers");// write number of service
                                    System.out.println("1- SALAD"); // first
                                    System.out.println("2-JUICE"); // second
                                    e = input.nextInt();
                                    if (e == 1) {
                                        System.out.println("100");// price = 100
                                        price = price + 100; //summation
                                    } else {
                                        if (e == 2) {
                                            System.out.println("50");// price =50
                                            price = price + 100; //summation
                                        }
                                    }
                                    System.out.println(" do you want another service");// write 1 if he want another service
                                    System.out.println("1- yes");// if he want another
                                    System.out.println("2- no"); // if he dont
                                    loop2 = input.nextInt(); // write number  1 or 2
                                }
                            }
                        }
                    }
                }
                while (loop2 == 1);// loop if he want come back and select other things
            } else {
                if (x == 3) {
                    int loop3 = 0;
                    do {
                        int cake; // difinition
                        int gitf;
                        int song;
                        int h;
                        System.out.println("choose by using numbers");// write number of service
                        System.out.println("1- CAKE"); // first
                        System.out.println("2- GIFT"); // second
                        System.out.println("3-SONGS"); // third
                        h = input.nextInt();
                        if (h == 1) {
                            int choclate;
                            int fanilla;
                            int i;
                            System.out.println("choose by using numbers");// write number of service
                            System.out.println("1- CHOCOLATE"); // first
                            System.out.println("2- VANILLA"); // second
                            i = input.nextInt();
                            if (i == 1) {
                                System.out.println("500"); // price = 500
                                price = price + 500; //summation
                            } else {
                                if (i == 2) {
                                    System.out.println("500"); // price = 500
                                    price = price + 500; //summation
                                }
                            }
                            System.out.println(" do you want another service");// write 1 if he want another service
                            System.out.println("1- yes");// if he want another
                            System.out.println("2- no"); // if he done
                            loop3 = input.nextInt();
                        } else {
                            if (h == 2) {
                                int smartdevice;
                                int iphone;
                                int j;
                                System.out.println("choose by using numbers");// write number of service
                                System.out.println("-1 IPHONE 13 BLACK"); // first
                                System.out.println("2- IPHONE 13 RED"); // second
                                j = input.nextInt(); // for write number
                                if (j == 1) {
                                    System.out.println("4000"); // price = 4000
                                    price = price + 4000; //summation
                                } else { // for loop
                                    if (j == 2) {
                                        System.out.println("5000"); // price = 4000
                                        price = price + 5000; //summation
                                    }
                                }
                                System.out.println(" do you want another service");// write 1 if he want another service
                                System.out.println("1- yes");// if he want another
                                System.out.println("2- no");
                                loop3 = input.nextInt();
                            } else { // for loop
                                if (h == 3) {
                                    int english;
                                    int arabic;
                                    int k;
                                    System.out.println("choose by using numbers");// write number of service
                                    System.out.println("1- ENGLISH SONGS");
                                    System.out.println("2- ARABIC SONGS");
                                    k = input.nextInt();
                                    if (k == 1) {
                                        System.out.println("200"); // price = 200
                                        price = price + 200; // summation
                                    } else { // for loop
                                        if (k == 2) {
                                            System.out.println("200"); //price = 200
                                            price = price + 200;  //summation
                                        }
                                    }
                                    System.out.println(" do you want another service");// write 1 if he want another service
                                    System.out.println("1- yes");// if he want another
                                    System.out.println("2- no"); // if he done
                                    loop3 = input.nextInt(); // for come back
                                }
                            }
                        }
                    }
                    while (loop3 == 1); // loop if he want come back and select other things
                }
            }
        }
        System.out.println("your receipt"); // the receipt
        System.out.println(name); // his name
        System.out.println(phonenumber); // his number
        System.out.println(price); // summation of prices
        int rate; // only numbers
        int r; // variable
        System.out.println("rate our service from 1-5"); // for rate my service from 1-5
        r = input.nextInt();  // write the rate
        System.out.println("enjooy^-^"); // the end
    }
}


