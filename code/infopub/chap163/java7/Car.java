package kr.co.infopub.chap163.java7;

public class  Car
{
        protected int sped=2;
        public void show(){//  1
                System.out.println("Car ~~ 1");
        }
        public int speed(){//? 2
                return sped;
        }
}
