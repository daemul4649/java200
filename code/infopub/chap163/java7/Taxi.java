package kr.co.infopub.chap163.java7;
public class  Taxi extends Car
{
        private int sped=6;
        public void show(){//overriding  6
                System.out.println("Taxi ~~ "+sped);
        }
        public int speed(){//overriding  7
                return sped;
        }
}
